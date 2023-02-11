package com.roberto.iban.utils.controller;

import com.roberto.iban.utils.datamodel.Iban;
import com.roberto.iban.utils.service.IbanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IbanController {

    IbanService ibanService;
    @Autowired
    public IbanController(IbanService ibanService) {
        this.ibanService = ibanService;
    }

    /**
     * Get Iban Details by country,bankCode,Account
     *
     * @param country
     * @return
     */
    @GetMapping("/iban")
    public Iban getIban(@RequestParam(name = "country", required = true, defaultValue = "IT") String country,
                            @RequestParam(name = "bankCode", required = true, defaultValue = "12345") String bankCode,
                            @RequestParam(name = "branch", required = false, defaultValue = "12345") String branch,
                            @RequestParam(name = "account", required = true, defaultValue = "12345") String account) {

        System.out.println(country+" - "+bankCode+" - "+account);
        Iban iban=new Iban();
        try {
            iban.setBankCode(bankCode);
            iban.setCountry(country);
            iban.setAccountNumber(account);
            iban.setIban(ibanService.calculateIban(country, bankCode, branch, account));
        }catch (Exception e)
        {
            iban.setInfo(e.getMessage() + e.getCause().getMessage());
            return iban;
        }
        return  iban;

    }
}
