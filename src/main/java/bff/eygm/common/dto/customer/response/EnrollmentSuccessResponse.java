package bff.eygm.common.dto.customer.response;

import java.io.Serializable;

public class EnrollmentSuccessResponse implements Serializable {
    private String code;
    private String status;
    private String type;

    public EnrollmentSuccessResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnrollmentSuccessResponse(String code, String status, String type) {
        this.code = code;
        this.status = status;
        this.type = type;
    }

    @Override
    public String toString() {
        return "EnrollmentSuccessResponse{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
