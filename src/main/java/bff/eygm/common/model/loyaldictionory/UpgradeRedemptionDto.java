package bff.eygm.common.model.loyaldictionory;

import java.io.Serializable;

public class UpgradeRedemptionDto implements Serializable {

    private String origin;
    private String destination;

    public UpgradeRedemptionDto(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public UpgradeRedemptionDto() {
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "UpgradeRedemptionDto{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
