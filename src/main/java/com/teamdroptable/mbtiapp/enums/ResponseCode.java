package com.teamdroptable.mbtiapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ResponseCode {
    /*success code*/
    SUCCESS(1, "succeed"),

    /*param error scope: 1001~1999*/
    PARM_IS_INVALID(1001, "user input invalid"),
    PARM_IS_BLANK(1002, "user input blank argument"),

    /*user triggered error*/
    USER_ACCESS_TOKEN_EXPIRED(2001, "user token expired"),

    /*service triggered error*/
    SERVER_UNAVAILABLE(3001, "server temporary unavailable"),
    UNEXPECTED_EXCEPTION(3002, "unexpected exception occurred"),
    INVALID_TOKEN(3003, "invalid token");

    private final Integer code;
    private final String message;
}
