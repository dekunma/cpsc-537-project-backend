package com.teamdroptable.mbtiapp.exceptions;

import com.teamdroptable.mbtiapp.enums.ResponseCode;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ApplicationException extends ResponseStatusException {
    private final ResponseCode code;

    public ApplicationException(final ResponseCode code, final HttpStatus httpStatus) {
        super(httpStatus);
        this.code = code;
    }

}