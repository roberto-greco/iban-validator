package com.roberto.iban.utils.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.iban.utils.repository.IbanInfoRepository;

@Service
public class IbanInfoService {
	
    private final IbanInfoRepository ibanInfoRepository;
    Logger log = LoggerFactory.getLogger(IbanInfoService.class);

    @Autowired
    public IbanInfoService(IbanInfoRepository ibanInfoRepository) {
        this.ibanInfoRepository = ibanInfoRepository;
    }

    public Optional<String> getIbanInfobyCountryCode(String countryCode)
    {
    	return ibanInfoRepository.getIbanInfobyCountryCode(countryCode);
    }
}
