package com.roberto.iban.utils.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roberto.iban.utils.datamodel.Iban;
import com.roberto.iban.utils.datamodel.IbanInfo;
import com.roberto.iban.utils.service.IbanInfoService;
import com.roberto.iban.utils.service.IbanService;

@RestController
public class IbanController {

	IbanService ibanService;
	IbanInfoService ibanInfoService;

	@Autowired
	public IbanController(IbanService ibanService, IbanInfoService ibanInfoService) {
		this.ibanService = ibanService;
		this.ibanInfoService = ibanInfoService;
	}

	/**
	 * Get Iban Details by country,bankCode,Account
	 *
	 * @param country
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/iban")
	public Iban getIban(@RequestParam(name = "country", required = true, defaultValue = "IT") String country,
			@RequestParam(name = "bankCode", required = true, defaultValue = "12345") String bankCode,
			@RequestParam(name = "branch", required = false, defaultValue = "12345") String branch,
			@RequestParam(name = "account", required = true, defaultValue = "12345") String account) throws Exception {

		System.out.println(country + " - " + bankCode + " - " + account);
		Iban iban = new Iban();

		iban.setBankCode(bankCode);
		iban.setCountry(country);
		iban.setAccountNumber(account);
		iban.setValid(true);
		iban.setIban(ibanService.calculateIban(country, bankCode, branch, account));
		String infoIban=ibanInfoService.getIbanInfobyCountryCode(country.toUpperCase()).get();
		
		ObjectMapper mapper = new ObjectMapper();  
		
		IbanInfo infoIbanMap= mapper.readValue(infoIban, new TypeReference<IbanInfo>() {}) ;
		
		iban.setInfo(infoIbanMap);

		return iban;

	}
	@GetMapping("/iban/validation")
	public Iban validateIban(@RequestParam(name = "iban", required = true) String iban) throws Exception
	{
		Iban ibanValidated = new Iban();
		ibanValidated=ibanService.detectIbanStructure(iban);
		String ibanCalculated=ibanService.calculateIban(ibanValidated.getCountry(), ibanValidated.getBankCode(), ibanValidated.getBranchCode(), ibanValidated.getAccountNumber());
		ibanValidated.setValid(iban.equalsIgnoreCase(ibanCalculated));
		ibanValidated.setIban(ibanCalculated);
		String infoIban=ibanInfoService.getIbanInfobyCountryCode(ibanValidated.getCountry()).get();
		ObjectMapper mapper = new ObjectMapper();  
		IbanInfo infoIbanMap= mapper.readValue(infoIban, new TypeReference<IbanInfo>() {}) ;
		
		ibanValidated.setInfo(infoIbanMap);
		return ibanValidated;
		
	}
}
