package com.roberto.iban.utils.service;

import com.roberto.iban.utils.IbanComposer;
import com.roberto.iban.utils.datamodel.Iban;
import com.roberto.iban.utils.exception.CountryNotSupportedException;
import com.roberto.iban.utils.exception.IbanFormatNotSupportedException;

import org.apache.commons.validator.routines.checkdigit.CheckDigitException;
import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IbanService {
	Logger log = LoggerFactory.getLogger(IbanService.class);

	public String findCheckDigit(String iban) {
		String checkDigit = "0";
		IBANCheckDigit ibanCheckDigit = new IBANCheckDigit();
		try {
			checkDigit = ibanCheckDigit.calculate(iban);
		} catch (CheckDigitException cdEx) {
			log.info(cdEx.getMessage());
		} finally {
			return checkDigit;
		}
	}

	public String calculateIban(String countryCode, String abi, String cab, String conto)
			throws CountryNotSupportedException, Exception {
		IbanComposer ic = new IbanComposer();
		String bban = ic.calculateBBAN(countryCode, abi, cab, conto);
		return ic.calculateIBAN(countryCode, bban);
	}

	public Iban detectIbanStructure(String iban) {
		Iban ibanToBeValidated = new Iban();
		if (null != iban && iban.length() > 2) {
			String countryCode = iban.substring(0, 2);
			if ("IT".equalsIgnoreCase(countryCode)) {
				if (iban.length() == 27) {
					ibanToBeValidated.setAccountNumber(iban.substring(15, 27));
					ibanToBeValidated.setBankCode(iban.substring(5, 10));
					ibanToBeValidated.setBranchCode(iban.substring(10, 15));
					ibanToBeValidated.setIban(iban);
					ibanToBeValidated.setCountry(countryCode);
				}
			} else if ("IE".equalsIgnoreCase(countryCode)) {
				if (iban.length() == 22) {
					ibanToBeValidated.setBankCode(iban.substring(4, 8));
					ibanToBeValidated.setBranchCode(iban.substring(8, 14));
					ibanToBeValidated.setAccountNumber(iban.substring(14, 22));
					ibanToBeValidated.setIban(iban);
					ibanToBeValidated.setCountry(countryCode);
				}
			} else if ("DE".equalsIgnoreCase(countryCode)) {
				if (iban.length() == 22) {
					ibanToBeValidated.setAccountNumber(iban.substring(12, 22));
					ibanToBeValidated.setBankCode(iban.substring(4, 12));
					ibanToBeValidated.setIban(iban);
					ibanToBeValidated.setCountry(countryCode);
				}
			} else {
				throw new CountryNotSupportedException(countryCode + " not supported for validitaion");
			}

		} else {
			throw new IbanFormatNotSupportedException("iban format provided not supported");
		}
		return ibanToBeValidated;
	}
}
