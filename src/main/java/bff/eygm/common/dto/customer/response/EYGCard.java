package bff.eygm.common.dto.customer.response;

import java.io.Serializable;

public class EYGCard implements Serializable {

    private String eygNo;

    public EYGCard(String eygNo) {
        this.eygNo = eygNo;
    }

    public String getEygNo() {
        return eygNo;
    }

    public void setEygNo(String eygNo) {
        this.eygNo = eygNo;
    }

    @Override
    public String toString() {
        return "EYGCard{" +
                "eygNo='" + eygNo + '\'' +
                '}';
    }
}
