package bff.eygm.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Nimesha on 10/21/2018 2:14 PM
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class EtihadUnauthorizedException extends RuntimeException {
    public EtihadUnauthorizedException(String message) {
        super(message);
    }

    public EtihadUnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtihadUnauthorizedException(Throwable cause) {
        super(cause);
    }

    private static final long serialVersionUID = 1L;
}
