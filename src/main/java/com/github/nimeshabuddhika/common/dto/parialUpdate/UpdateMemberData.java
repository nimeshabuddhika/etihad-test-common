package com.github.nimeshabuddhika.common.dto.parialUpdate;

import java.io.Serializable;

public class UpdateMemberData implements Serializable {



    /**
     * field for CardNumber
     */
    private String cardNumber;

    /**
     * field for Attributes
     * This was an Array!
     */
    private AttributeData[] attributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean attributesTracker = false ;


    /**
     * field for ExtAttributes
     * This was an Array!
     */
    private ExtAttributeData[] extAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean extAttributesTracker = false ;


    private DynamicAttributeData[] dynamicAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean dynamicAttributesTracker = false ;


    private AssignmentModifyData[] assignments;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean assignmentsTracker = false ;


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public AttributeData[] getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeData[] attributes) {
        this.attributes = attributes;
    }

    public boolean isAttributesTracker() {
        return attributesTracker;
    }

    public void setAttributesTracker(boolean attributesTracker) {
        this.attributesTracker = attributesTracker;
    }

    public ExtAttributeData[] getExtAttributes() {
        return extAttributes;
    }

    public void setExtAttributes(ExtAttributeData[] extAttributes) {
        this.extAttributes = extAttributes;
    }

    public boolean isExtAttributesTracker() {
        return extAttributesTracker;
    }

    public void setExtAttributesTracker(boolean extAttributesTracker) {
        this.extAttributesTracker = extAttributesTracker;
    }

    public DynamicAttributeData[] getDynamicAttributes() {
        return dynamicAttributes;
    }

    public void setDynamicAttributes(DynamicAttributeData[] dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }

    public boolean isDynamicAttributesTracker() {
        return dynamicAttributesTracker;
    }

    public void setDynamicAttributesTracker(boolean dynamicAttributesTracker) {
        this.dynamicAttributesTracker = dynamicAttributesTracker;
    }

    public AssignmentModifyData[] getAssignments() {
        return assignments;
    }

    public void setAssignments(AssignmentModifyData[] assignments) {
        this.assignments = assignments;
    }

    public boolean isAssignmentsTracker() {
        return assignmentsTracker;
    }

    public void setAssignmentsTracker(boolean assignmentsTracker) {
        this.assignmentsTracker = assignmentsTracker;
    }
}


