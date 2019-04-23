package com.github.nimeshabuddhika.common.model.loyaldictionory;

import java.io.Serializable;

public class AirUpgradeRedemptionCalcDto implements Serializable {

    private String airportFrom;
    private String airportTo;

    public AirUpgradeRedemptionCalcDto(String airportFrom, String airportTo) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public AirUpgradeRedemptionCalcDto() {
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }
}
