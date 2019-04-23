package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class MilesTeaserDto implements Serializable {

    private int numberOfMiles;
    private Reward rewards;
    private ResultSize resultSize;
    private AirTravel airTravel;

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public Reward getRewards() {
        return rewards;
    }

    public void setRewards(Reward rewards) {
        this.rewards = rewards;
    }

    public ResultSize getResultSize() {
        return resultSize;
    }

    public void setResultSize(ResultSize resultSize) {
        this.resultSize = resultSize;
    }

    public AirTravel getAirTravel() {
        return airTravel;
    }

    public void setAirTravel(AirTravel airTravel) {
        this.airTravel = airTravel;
    }
}

