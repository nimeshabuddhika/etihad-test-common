package bff.eygm.common.model.loyaldictionory;

import java.io.Serializable;

public class RedemptionCalcByDestDto implements Serializable {

    private String flightType;
    private String adults;
    private String children;
    private String Infants;
    private String origin;
    private String destination;
    private String classOfService;

    public RedemptionCalcByDestDto() {
    }

    public RedemptionCalcByDestDto(String flightType, String adults, String children, String infants, String origin, String destination, String classOfService) {
        this.flightType = flightType;
        this.adults = adults;
        this.children = children;
        Infants = infants;
        this.origin = origin;
        this.destination = destination;
        this.classOfService = classOfService;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getInfants() {
        return Infants;
    }

    public void setInfants(String infants) {
        Infants = infants;
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
}
