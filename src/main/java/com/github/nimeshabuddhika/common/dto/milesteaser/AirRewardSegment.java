package com.github.nimeshabuddhika.common.dto.milesteaser;

import com.github.nimeshabuddhika.common.model.loyaldictionory.AirportsDto;

import java.io.Serializable;

public class AirRewardSegment implements Serializable {

    private String originAirport;
    private String destinationAirport;
    private String miles;
    private String cabinClass;
    private String journeyType;
    private String airlineCode;
    private String imageUrl;
    private AirportsDto origin;
    private AirportsDto dest;

    public AirportsDto getOrigin() {
        return origin;
    }

    public void setOrigin(AirportsDto origin) {
        this.origin = origin;
    }

    public AirportsDto getDest() {
        return dest;
    }

    public void setDest(AirportsDto dest) {
        this.dest = dest;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getJourneyType() {
        return journeyType;
    }

    public void setJourneyType(String journeyType) {
        this.journeyType = journeyType;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @Override
    public String toString() {
        return "AirRewardSegment{" +
                "originAirport='" + originAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", miles='" + miles + '\'' +
                ", cabinClass='" + cabinClass + '\'' +
                ", journeyType='" + journeyType + '\'' +
                ", airlineCode='" + airlineCode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}