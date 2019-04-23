package com.github.nimeshabuddhika.common.model.enums;

public enum IPType {

    MEMBER("Member"),APPLICATION("Application"),INTERNAL("Internal");

    private String value;

    private IPType(String values){
        this.value=values;
    }

    @Override
    public String toString(){
        return value;
    }
}
