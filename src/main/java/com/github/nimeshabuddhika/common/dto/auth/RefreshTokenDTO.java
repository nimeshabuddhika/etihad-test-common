package com.github.nimeshabuddhika.common.dto.auth;

import java.io.Serializable;

/**
 * @author Nimesha on 11/15/2018 11:43 AM
 */
public class RefreshTokenDTO implements Serializable {
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
