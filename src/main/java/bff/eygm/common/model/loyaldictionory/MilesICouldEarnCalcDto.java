package bff.eygm.common.model.loyaldictionory;

import java.io.Serializable;

public class MilesICouldEarnCalcDto implements Serializable {

    private String flightType;
    private String origin;
    private String destination;
    private String classOfService;
    private String tierStatus;

    public MilesICouldEarnCalcDto(String flightType, String origin, String destination, String classOfService, String tierStatus) {
        this.flightType = flightType;
        this.origin = origin;
        this.destination = destination;
        this.classOfService = classOfService;
        this.tierStatus = tierStatus;
    }

    public MilesICouldEarnCalcDto() {
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
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

    public String getClassOfService() {
        return classOfService;
    }

    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    public String getTierStatus() {
        return tierStatus;
    }

    public void setTierStatus(String tierStatus) {
        this.tierStatus = tierStatus;
    }
}
