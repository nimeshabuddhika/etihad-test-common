package bff.eygm.common.model.loyaldictionory;

public class MilesICouldEarnDto {

    private String flightType;
    private String origin;
    private String destination;
    private String date;
    private String classOfService;
    private String partner;
    private String tierLevel;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassOfService() {
        return classOfService;
    }

    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getTierLevel() {
        return tierLevel;
    }

    public void setTierLevel(String tierLevel) {
        this.tierLevel = tierLevel;
    }

    @Override
    public String toString() {
        return "MilesICouldEarnDto{" +
                "flightType='" + flightType + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", classOfService='" + classOfService + '\'' +
                ", partner='" + partner + '\'' +
                ", tierLevel='" + tierLevel + '\'' +
                '}';
    }
}
