package com.github.nimeshabuddhika.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Nimesha on 10/10/2018 7:22 PM
 */

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class EtihadException extends RuntimeException {
    public EtihadException(String message) {
        super(message);
    }

    public EtihadException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtihadException(Throwable cause) {
        super(cause);
    }

    private static final long serialVersionUID = 1L;
}