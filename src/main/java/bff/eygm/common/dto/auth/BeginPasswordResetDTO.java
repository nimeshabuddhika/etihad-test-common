package bff.eygm.common.dto.auth;

import java.io.Serializable;

/**
 * @author Nimesha on 11/15/2018 12:31 PM
 */
public class BeginPasswordResetDTO implements Serializable {
    private String eygNumber;
    private String email;
    private String type;

    public String getEygNumber() {
        return eygNumber;
    }

    public void setEygNumber(String eygNumber) {
        this.eygNumber = eygNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BeginPasswordResetDTO{" +
                "eygNumber='" + eygNumber + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
