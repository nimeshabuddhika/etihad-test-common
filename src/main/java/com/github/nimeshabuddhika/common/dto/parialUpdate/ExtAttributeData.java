package com.github.nimeshabuddhika.common.dto.parialUpdate;

import java.io.Serializable;

public class ExtAttributeData implements Serializable {

    /**
     * field for Code
     */
    private String code;

    /**
     * field for Value
     */
    private String value;

    /**  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean localValueTracker = false;

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

    public boolean isLocalValueTracker() {
        return localValueTracker;
    }

    public void setLocalValueTracker(boolean localValueTracker) {
        this.localValueTracker = localValueTracker;
    }
}
