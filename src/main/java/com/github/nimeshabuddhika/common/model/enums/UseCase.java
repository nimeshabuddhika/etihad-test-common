package com.github.nimeshabuddhika.common.model.enums;

public enum UseCase {

    STANDARD("EYGUEST"),ETIHADSTAFF("EYGUEST"),BUSINESSCONNECTION("EYBUSCONN"),CARGOCONNECTION("EYGUEST"),SUPERSELLER("EYGUEST"),DEFAULT("EYGUEST");
    private String value;

    private UseCase(String values){
        this.value=values;
    }

    @Override
    public String toString(){
        return value;
    }

}
