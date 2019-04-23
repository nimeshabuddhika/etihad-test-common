package com.github.nimeshabuddhika.common.dto.cardStore;

import java.io.Serializable;

public class CardDetailsDto implements Serializable {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String countryCode;
    private String street;
    private String city;
    private String postalCode;
    private String email;
    private String eygNo;
    private String cardType;
    private String currency;

    public CardDetailsDto() {
    }

    public CardDetailsDto(String firstName, String lastName, String cardNumber, String expiryDate, String cvv, String countryCode, String street, String city, String postalCode, String email, String eygNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.countryCode = countryCode;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
        this.eygNo = eygNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEygNo() {
        return eygNo;
    }

    public void setEygNo(String eygNo) {
        this.eygNo = eygNo;
    }

    @Override
    public String toString() {
        return "CardDetailsDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", email='" + email + '\'' +
                ", eygNo='" + eygNo + '\'' +
                '}';
    }


}
