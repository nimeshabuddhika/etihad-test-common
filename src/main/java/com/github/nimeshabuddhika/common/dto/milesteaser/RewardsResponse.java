package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class RewardsResponse implements Serializable {

    private AirRewardsResponse airRewardsResponse;

    private NonAirRewardsResponse nonAirRewardsResponse;

    private boolean airRewardsResponseSpecified;

    private boolean nonAirRewardsResponseSpecified;

    public boolean isAirRewardsResponseSpecified() {
        return airRewardsResponseSpecified;
    }

    public void setAirRewardsResponseSpecified(boolean airRewardsResponseSpecified) {
        this.airRewardsResponseSpecified = airRewardsResponseSpecified;
    }

    public boolean isNonAirRewardsResponseSpecified() {
        return nonAirRewardsResponseSpecified;
    }

    public void setNonAirRewardsResponseSpecified(boolean nonAirRewardsResponseSpecified) {
        this.nonAirRewardsResponseSpecified = nonAirRewardsResponseSpecified;
    }

    public NonAirRewardsResponse getNonAirRewardsResponse() {
        return nonAirRewardsResponse;
    }

    public void setNonAirRewardsResponse(NonAirRewardsResponse nonAirRewardsResponse) {
        this.nonAirRewardsResponse = nonAirRewardsResponse;
    }

    public AirRewardsResponse getAirRewardsResponse() {
        return airRewardsResponse;
    }

    public void setAirRewardsResponse(AirRewardsResponse airRewardsResponse) {
        this.airRewardsResponse = airRewardsResponse;
    }
}
