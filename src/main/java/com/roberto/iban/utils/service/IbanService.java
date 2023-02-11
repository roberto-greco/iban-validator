package com.roberto.iban.utils.service;


import com.roberto.iban.utils.IbanComposer;
import org.apache.commons.validator.routines.checkdigit.CheckDigitException;
import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IbanService {
    Logger log = LoggerFactory.getLogger(IbanService.class);
    public String findCheckDigit(String iban) {
        String checkDigit="0";
        IBANCheckDigit ibanCheckDigit= new IBANCheckDigit();
        try {
            checkDigit=ibanCheckDigit.calculate(iban);
        }catch (CheckDigitException cdEx){
            log.info(cdEx.getMessage());
        }finally {
            return checkDigit;
        }
    }

    public String calculateIban(String countryCode, String abi, String cab, String conto) throws Exception{
        IbanComposer ic = new IbanComposer();
        String bban=ic.calculateBBAN(countryCode, abi, cab, conto);
        return ic.calculateIBAN(countryCode,bban);
    }
}
