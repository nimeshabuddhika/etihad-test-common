package com.github.nimeshabuddhika.common.dto.cardStore;

import java.io.Serializable;

public class CardDeleteRequest implements Serializable {

    private String startDate;
    private String subtype;
    private String eygNo;

    public String getEygNo() {
        return eygNo;
    }

    public void setEygNo(String eygNo) {
        this.eygNo = eygNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
}
