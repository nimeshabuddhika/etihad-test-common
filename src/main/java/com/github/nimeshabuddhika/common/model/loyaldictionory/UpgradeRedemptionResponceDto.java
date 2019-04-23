package com.github.nimeshabuddhika.common.model.loyaldictionory;

import java.io.Serializable;

public class UpgradeRedemptionResponceDto implements Serializable {

    private String airlineCode;
    private String bookingClass;
    private String bookingClassGroup;
    private String kind;
    private String miles;
    private String bookingClassGroupName;

    public UpgradeRedemptionResponceDto() {
    }

    public UpgradeRedemptionResponceDto(String airlineCode, String bookingClass, String bookingClassGroup, String kind, String miles, String bookingClassGroupName) {
        this.airlineCode = airlineCode;
        this.bookingClass = bookingClass;
        this.bookingClassGroup = bookingClassGroup;
        this.kind = kind;
        this.miles = miles;
        this.bookingClassGroupName = bookingClassGroupName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getBookingClassGroup() {
        return bookingClassGroup;
    }

    public void setBookingClassGroup(String bookingClassGroup) {
        this.bookingClassGroup = bookingClassGroup;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getBookingClassGroupName() {
        return bookingClassGroupName;
    }

    public void setBookingClassGroupName(String bookingClassGroupName) {
        this.bookingClassGroupName = bookingClassGroupName;
    }
}
