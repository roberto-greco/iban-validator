package com.roberto.iban.utils.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
public class IbanInfoRepository {
	
	
	
	
	private final Properties infoByCountry;

	@Autowired
	public IbanInfoRepository(Properties infoByCountry) {
		this.infoByCountry = infoByCountry;
		// TODO Auto-generated constructor stub
		try {	
		File file = ResourceUtils.getFile("classpath:iban_format.properties");
        InputStream in = new FileInputStream(file);
		this.infoByCountry.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public Optional<String> getIbanInfobyCountryCode (String countryCode)
	{
		return Optional.ofNullable(infoByCountry.getProperty(countryCode));
	}

}
