package bff.eygm.common.dto.parialUpdate;

import java.io.Serializable;

public  class DynamicAttributeData implements Serializable {


    /**
     * field for Code
     */
    protected String code;

    /**
     * field for Value
     */

    protected String value;


    protected boolean valueTracker = false ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValueTracker() {
        return valueTracker;
    }

    public void setValueTracker(boolean valueTracker) {
        this.valueTracker = valueTracker;
    }
}