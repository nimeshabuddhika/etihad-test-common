package bff.eygm.common.dto.milesteaser;

import java.io.Serializable;

public class ResultSize implements Serializable {

    private int airResultSize;
    private int nonAirResultSize;

    public ResultSize() {
    }

    public ResultSize(int airResultSize, int nonAirResultSize) {
        this.airResultSize = airResultSize;
        this.nonAirResultSize = nonAirResultSize;
    }

    public int getAirResultSize() {
        return airResultSize;
    }

    public void setAirResultSize(int airResultSize) {
        this.airResultSize = airResultSize;
    }

    public int getNonAirResultSize() {
        return nonAirResultSize;
    }

    public void setNonAirResultSize(int nonAirResultSize) {
        this.nonAirResultSize = nonAirResultSize;
    }

    @Override
    public String toString() {
        return "ResultSize{" +
                "airResultSize=" + airResultSize +
                ", nonAirResultSize=" + nonAirResultSize +
                '}';
    }
}
