package com.github.nimeshabuddhika.common.controller;

import com.github.nimeshabuddhika.common.model.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

/**
 * @author Nimesha on 10/20/2018 8:18 PM
 */
public class EtihadResponseController extends ResponseController {

    public ResponseEntity<Object> sendResponse(Object object) {
        if (!(object instanceof ErrorMessages))
            return this.sendResponse(object, HttpStatus.OK);
        ErrorMessages error = (ErrorMessages) object;
        error.setTimestamp((new Date()).toString());
        return this.sendResponse(error);
    }


    public ResponseEntity<Object> sendResponse(ErrorMessages errorMessages) {

        switch (errorMessages.getErrorCode()) {
            case "2000":
                errorMessages.setError(HttpStatus.CONFLICT);
                return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessages);
            case "2007":
                errorMessages.setError(HttpStatus.CONFLICT);
                return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessages);
            case "0001":
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "0002":
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "0100":
                errorMessages.setError(HttpStatus.INTERNAL_SERVER_ERROR);
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessages);
            case "0008":
                errorMessages.setError(HttpStatus.BAD_REQUEST); //TODO Unauthorized
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "0005":
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "0202":
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "2040":
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "E0000004":
                errorMessages.setError(HttpStatus.BAD_REQUEST); //TODO Unauthorized
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
            case "BF_AU0004":
                errorMessages.setError(HttpStatus.FORBIDDEN);
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorMessages);
            default:
                errorMessages.setError(HttpStatus.BAD_REQUEST);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
        }
    }
}
