package com.github.nimeshabuddhika.common.response;

/**
 * @author Nimesha on 10/1/2018 3:21 PM
 */
public enum ResponseMessage {
    UNAUTHORIZED_REQUEST("Unauthorized request."),
    SOMETHING_WENT_WRONG("Something went wrong."),
    ERROR_UPLOADING("Error while uploading file. Please try again."),
    INVALID_USER_TOKEN("Invalid user token"),
    EYG_NOT_ALLOWED("EygNo header is not allowed"),
    REQUEST_PROCESSING_FAILED("Request processing failed."),
    PASSWORD_MISMATCHED("Password mismatched."),
    BEARER_IS_REQUIRED("Bearer is required"),
    SUCCESS("SUCCESS"),
    SUCCESSFULLY_ADDED("Successfully added."),
    SUCCESSFULLY_DELETED("Successfully deleted."),
    SUCCESSFULLY_UPDATED("Successfully updated.");

    private String message;

    private ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}