package com.github.nimeshabuddhika.common.controller;


import com.github.nimeshabuddhika.common.model.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

/**
 * @author Nimesha on 10/2/2018 11:02 AM
 */
public class ResponseController {
    public ResponseEntity<Object> sendResponse(Object object) {
        if (object instanceof ErrorMessages) {
            ErrorMessages error = (ErrorMessages) object;
            error.setTimestamp(new Date().toString());
            return sendResponse(error, error.getError());
        }
        return sendResponse(object, HttpStatus.OK);
    }

    public ResponseEntity<Object> sendResponse(Object object, HttpStatus httpStatus) {
        return ResponseEntity.status(httpStatus)
                .header("Content-Type", "application/json")
                .body(object);
    }
}
