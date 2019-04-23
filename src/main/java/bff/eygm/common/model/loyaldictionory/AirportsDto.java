package bff.eygm.common.model.loyaldictionory;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class AirportsDto implements Serializable {

    private String code;
    private LinkedHashMap city;
    private LinkedHashMap country;
    private LinkedHashMap name;
    private LinkedHashMap countryCode;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AirportsDto(String code, LinkedHashMap city, LinkedHashMap country, LinkedHashMap name, LinkedHashMap countryCode, String imageUrl) {
        this.code = code;
        this.city = city;
        this.country = country;
        this.name = name;
        this.countryCode = countryCode;
        this.imageUrl = imageUrl;
    }

    public AirportsDto(String code, LinkedHashMap city, LinkedHashMap country, LinkedHashMap name, LinkedHashMap countryCode) {
        this.code = code;
        this.city = city;
        this.country = country;
        this.name = name;
        this.countryCode = countryCode;
    }

    public AirportsDto() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LinkedHashMap getCity() {
        return city;
    }

    public void setCity(LinkedHashMap city) {
        this.city = city;
    }

    public LinkedHashMap getCountry() {
        return country;
    }

    public void setCountry(LinkedHashMap country) {
        this.country = country;
    }

    public LinkedHashMap getName() {
        return name;
    }

    public void setName(LinkedHashMap name) {
        this.name = name;
    }

    public LinkedHashMap getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(LinkedHashMap countryCode) {
        this.countryCode = countryCode;
    }
}
