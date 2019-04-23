package bff.eygm.common.dto.auth;

/**
 * @author Nimesha on 11/15/2018 12:59 PM
 */
public class ResetPasswordDTO {
    private String eygNumber;
    private String dob;
    private String password;
    private String cPassword;
    private String type;
    private String hash;

    public String getEygNumber() {
        return eygNumber;
    }

    public void setEygNumber(String eygNumber) {
        this.eygNumber = eygNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "ResetPasswordDTO{" +
                "eygNumber='" + eygNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
