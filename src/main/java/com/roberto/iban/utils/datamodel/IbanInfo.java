package com.roberto.iban.utils.datamodel;

public class IbanInfo {

	/**
	 * 
	 * "{ 
	 * 		"countryName\" : \"Germany\", 
	 * 		"length\" : \"22\", \
	 * 		"bbanFormat\" : \"18n\", \
	 * 		"ibanFields\" : \"DEkk bbbb bbbb cccc cccc cc\", \
	 * 		"legenda\" : \"b = Bank and branch identifier (Bankleitzahl or BLZ) c = Account number \"
	 * }"
	 */

	private String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBbanFormat() {
		return bbanFormat;
	}

	public void setBbanFormat(String bbanFormat) {
		this.bbanFormat = bbanFormat;
	}

	public String getIbanFields() {
		return ibanFields;
	}

	public void setIbanFields(String ibanFields) {
		this.ibanFields = ibanFields;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	private String length;
	private String bbanFormat;
	private String ibanFields;
	private String legenda;
 
}


