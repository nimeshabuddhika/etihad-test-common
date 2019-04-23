package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class NonAirResponse  implements Serializable {

    private NonAirRewardSegment[] nonAirRewardSegment;

    public NonAirRewardSegment[] getNonAirRewardSegment() {
        return nonAirRewardSegment;
    }

    public void setNonAirRewardSegment(NonAirRewardSegment[] nonAirRewardSegment) {
        this.nonAirRewardSegment = nonAirRewardSegment;
    }
}
