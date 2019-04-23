package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class AirTravel implements Serializable {

    private String origin;
    private String destination;
    private String memberTier;
    private String journeyType;
    private String cabinClass;
    private String airlineCode;
    private String cabinClassSpecified;
    private String departureDate;
    private String shippingCountry;
    private String sortType;
    private String memberCurrencyCode;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMemberTier() {
        return memberTier;
    }

    public void setMemberTier(String memberTier) {
        this.memberTier = memberTier;
    }

    public String getJourneyType() {
        return journeyType;
    }

    public void setJourneyType(String journeyType) {
        this.journeyType = journeyType;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getCabinClassSpecified() {
        return cabinClassSpecified;
    }

    public void setCabinClassSpecified(String cabinClassSpecified) {
        this.cabinClassSpecified = cabinClassSpecified;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getMemberCurrencyCode() {
        return memberCurrencyCode;
    }

    public void setMemberCurrencyCode(String memberCurrencyCode) {
        this.memberCurrencyCode = memberCurrencyCode;
    }

    @Override
    public String toString() {
        return "AirTravel{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", memberTier='" + memberTier + '\'' +
                ", journeyType='" + journeyType + '\'' +
                ", cabinClass='" + cabinClass + '\'' +
                ", airlineCode='" + airlineCode + '\'' +
                ", cabinClassSpecified='" + cabinClassSpecified + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                ", sortType='" + sortType + '\'' +
                ", memberCurrencyCode='" + memberCurrencyCode + '\'' +
                '}';
    }
}
