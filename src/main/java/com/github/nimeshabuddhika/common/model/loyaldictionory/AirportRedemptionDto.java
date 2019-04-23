package com.github.nimeshabuddhika.common.model.loyaldictionory;

import java.io.Serializable;
import java.util.ArrayList;

public class AirportRedemptionDto implements Serializable {

    private String iata;
    private ArrayList<String> destinations;

    public AirportRedemptionDto(String iata, ArrayList<String> destinations) {
        this.iata = iata;
        this.destinations = destinations;
    }

    public AirportRedemptionDto() {
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public ArrayList<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<String> destinations) {
        this.destinations = destinations;
    }
}
