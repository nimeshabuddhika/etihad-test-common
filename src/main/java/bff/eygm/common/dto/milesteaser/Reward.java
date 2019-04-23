package bff.eygm.common.dto.milesteaser;

import java.io.Serializable;

public class Reward implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "value='" + value + '\'' +
                '}';
    }
}
