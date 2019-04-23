package bff.eygm.common.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author Nimesha on 10/19/2018 3:41 PM
 */
public class ErrorMessages implements Serializable {
    private HttpStatus error;
    private String title;
    private String message;
    private String errorCode;
    private String path;
    private int status;
    private String timestamp;

    public ErrorMessages() {

    }

    public ErrorMessages(HttpStatus error, String message, String errorCode) {
        this.error = error;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorMessages(HttpStatus error, String title, String message, String errorCode) {
        this.error = error;
        this.title = title;
        this.message = message;
        this.errorCode = errorCode;
    }


    public ErrorMessages(String message, String path, String timestamp, String errorCode) {
        this.message = message;
        this.path = path;
        this.timestamp = timestamp;
        this.errorCode = errorCode;
    }

    public ErrorMessages(String title, String message, String errorCode){
        this.title = title;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorMessages( String message, String errorCode){
        this.message = message;
        this.errorCode = errorCode;
    }


    public HttpStatus getError() {
        return error;
    }

    public void setError(HttpStatus error) {
        this.error = error;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getStatus() {
        if (error != null)
            status = error.value();
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
