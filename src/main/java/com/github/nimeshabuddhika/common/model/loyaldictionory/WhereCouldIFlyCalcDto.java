package com.github.nimeshabuddhika.common.model.loyaldictionory;

import java.io.Serializable;

public class WhereCouldIFlyCalcDto implements Serializable {

    private String adults;
    private String children;
    private String infants;
    private String miles;
    private String origin;
    private String classOfService;

    public WhereCouldIFlyCalcDto(String adults, String children, String infants, String miles, String origin, String classOfService) {
        this.adults = adults;
        this.children = children;
        this.infants = infants;
        this.miles = miles;
        this.origin = origin;
        this.classOfService = classOfService;
    }

    public WhereCouldIFlyCalcDto() {
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
        return infants;
    }

    public void setInfants(String infants) {
        this.infants = infants;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getClassOfService() {
        return classOfService;
    }

    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    @Override
    public String toString() {
        return "WhereCouldIFlyCalcDto{" +
                "adults='" + adults + '\'' +
                ", children='" + children + '\'' +
                ", infants='" + infants + '\'' +
                ", miles='" + miles + '\'' +
                ", origin='" + origin + '\'' +
                ", classOfService='" + classOfService + '\'' +
                '}';
    }
}
