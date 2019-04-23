package com.github.nimeshabuddhika.common.model;

/**
 * @author Nimesha on 11/1/2018 11:36 AM
 */
public class SuccessResponseModel {

    private boolean status;
    private String title;
    private String message;

    public SuccessResponseModel() {
    }

    public SuccessResponseModel(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public SuccessResponseModel(boolean status, String title, String message) {
        this.status = status;
        this.title = title;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "SuccessResponseModel{" +
                "status=" + status +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
