package bff.eygm.common.dto.auth;

import java.io.Serializable;

/**
 * @author Nimesha on 11/14/2018 4:42 PM
 */
public class LoginSuccessDTO implements Serializable {
    private String accessToken;
    private String refreshToken;
    private String desc;
    private boolean otpRequired;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isOtpRequired() {
        return otpRequired;
    }

    public void setOtpRequired(boolean otpRequired) {
        this.otpRequired = otpRequired;
    }


}
