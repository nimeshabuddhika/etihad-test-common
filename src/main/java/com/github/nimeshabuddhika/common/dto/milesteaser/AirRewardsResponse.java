package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class AirRewardsResponse implements Serializable {

    private AirResponse airResponse;


    public AirResponse getAirResponse() {
        return airResponse;
    }

    public void setAirResponse(AirResponse airResponse) {
        this.airResponse = airResponse;
    }
}
