package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class AirResponse implements Serializable {

    private AirRewardSegment[] airRewardSegment;

    private boolean airRewardSegmentSpecified;

    public boolean isAirRewardSegmentSpecified() {
        return airRewardSegmentSpecified;
    }

    public void setAirRewardSegmentSpecified(boolean airRewardSegmentSpecified) {
        this.airRewardSegmentSpecified = airRewardSegmentSpecified;
    }



    public AirRewardSegment[] getAirRewardSegment() {
        return airRewardSegment;
    }

    public void setAirRewardSegment(AirRewardSegment[] airRewardSegment) {
        this.airRewardSegment = airRewardSegment;
    }
}
