package com.roberto.iban.utils.datamodel;

import java.util.Objects;

public class Iban {

    private String iban;
    private String country;
    private String bankCode;
    private String accountNumber;
    private String checkDigit;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    public Iban() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Iban)) return false;
        Iban iban1 = (Iban) o;
        return getIban().equals(iban1.getIban()) && getCountry().equals(iban1.getCountry()) && getBankCode().equals(iban1.getBankCode()) && getAccountNumber().equals(iban1.getAccountNumber()) && getCheckDigit().equals(iban1.getCheckDigit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban(), getCountry(), getBankCode(), getAccountNumber(), getCheckDigit());
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }
}
