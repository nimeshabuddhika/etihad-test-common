package com.github.nimeshabuddhika.common.model.loyaldictionory;

import java.io.Serializable;

public class WhereICouldFlyCalcResponceDto implements Serializable {

    private AirportsDto destinationAirport;
    private String miles;

    public WhereICouldFlyCalcResponceDto() {
    }

    public WhereICouldFlyCalcResponceDto(AirportsDto destinationAirport, String miles) {
        this.destinationAirport = destinationAirport;
        this.miles = miles;
    }

    public AirportsDto getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(AirportsDto destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }
}
