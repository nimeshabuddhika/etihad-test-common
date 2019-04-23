package com.github.nimeshabuddhika.common.dto.auth;

import java.io.Serializable;

/**
 * @author Nimesha on 11/14/2018 4:28 PM
 */
public class LoginDTO implements Serializable {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "LoginDTO{" +
                "email='" + email + '\'' +
                '}';
    }
}
