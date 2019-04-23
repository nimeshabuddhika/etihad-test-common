package bff.eygm.common.dto.milesteaser;

import java.io.Serializable;

public class NonAirRewardsResponse implements Serializable {
    private NonAirResponse nonAirResponse;

    public NonAirResponse getNonAirResponse() {
        return nonAirResponse;
    }

    public void setNonAirResponse(NonAirResponse nonAirResponse) {
        this.nonAirResponse = nonAirResponse;
    }

}
