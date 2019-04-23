package com.github.nimeshabuddhika.common.model.loyaldictionory;

public class AirRedemptionByDestResponceDto {

            private String cabinclass;
            private String carrier;
            private String destinationairport;
            private String price;
            private String roundtrip;
            private String originairport;

    public AirRedemptionByDestResponceDto() {
    }

    public AirRedemptionByDestResponceDto(String cabinclass, String carrier, String destinationairport, String price, String roundtrip, String originairport) {
        this.cabinclass = cabinclass;
        this.carrier = carrier;
        this.destinationairport = destinationairport;
        this.price = price;
        this.roundtrip = roundtrip;
        this.originairport = originairport;
    }

    public String getCabinclass() {
        return cabinclass;
    }

    public void setCabinclass(String cabinclass) {
        this.cabinclass = cabinclass;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDestinationairport() {
        return destinationairport;
    }

    public void setDestinationairport(String destinationairport) {
        this.destinationairport = destinationairport;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoundtrip() {
        return roundtrip;
    }

    public void setRoundtrip(String roundtrip) {
        this.roundtrip = roundtrip;
    }

    public String getOriginairport() {
        return originairport;
    }

    public void setOriginairport(String originairport) {
        this.originairport = originairport;
    }
}
