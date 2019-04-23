package bff.eygm.common.dto.parialUpdate;

import java.io.Serializable;

public class AssignmentModifyData implements Serializable {


    /**
     * field for EndDate
     */
    private String endDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean endDateTracker = false;


    /**
     * field for ExtFields
     * This was an Array!
     */
    private ExtAttributeData[] extFields;

    private boolean localExtFieldsTracker = false;


    /**
     * field for FileData
     */
    private String fileData;

    private boolean fileDataTracker = false;


    /**
     * field for FileName
     */
    private String fileName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean fileNameTracker = false;


    /**
     * field for FileType
     */
    private String fileType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    private boolean fileTypeTracker = false;


    /**
     * field for Operation
     */
    private String operation;


    /**
     * field for StartDate
     */
    private String startDate;


    /**
     * field for Subtype
     */
    private String subtype;


    /**
     * field for Type
     */
    private String type;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isEndDateTracker() {
        return endDateTracker;
    }

    public void setEndDateTracker(boolean endDateTracker) {
        this.endDateTracker = endDateTracker;
    }

    public ExtAttributeData[] getExtFields() {
        return extFields;
    }

    public void setExtFields(ExtAttributeData[] extFields) {
        this.extFields = extFields;
    }

    public boolean isLocalExtFieldsTracker() {
        return localExtFieldsTracker;
    }

    public void setLocalExtFieldsTracker(boolean localExtFieldsTracker) {
        this.localExtFieldsTracker = localExtFieldsTracker;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public boolean isFileDataTracker() {
        return fileDataTracker;
    }

    public void setFileDataTracker(boolean fileDataTracker) {
        this.fileDataTracker = fileDataTracker;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isFileNameTracker() {
        return fileNameTracker;
    }

    public void setFileNameTracker(boolean fileNameTracker) {
        this.fileNameTracker = fileNameTracker;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public boolean isFileTypeTracker() {
        return fileTypeTracker;
    }

    public void setFileTypeTracker(boolean fileTypeTracker) {
        this.fileTypeTracker = fileTypeTracker;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
           