package com.teamdroptable.mbtiapp.common;

import com.teamdroptable.mbtiapp.enums.ResponseCode;
import lombok.Data;

@Data
public class CommonResponse<T> {
    private int code;
    private String message;
    private T data;

    public static CommonResponse<Void> success() {
        final var commonResponse = new CommonResponse<Void>();
        commonResponse.setCode(ResponseCode.SUCCESS.getCode());
        return commonResponse;
    }

    public static <T> CommonResponse<T> success(T data) {
        final var commonResponse = new CommonResponse<T>();
        commonResponse.setCode(ResponseCode.SUCCESS.getCode());
        commonResponse.setData(data);
        return commonResponse;
    }

    public static CommonResponse<Void> fail(ResponseCode code) {
        final var failureResponse = new CommonResponse<Void>();
        failureResponse.setCode(code.getCode());
        failureResponse.setMessage(code.getMessage());
        return failureResponse;
    }

    public static <T> CommonResponse<T> fail(ResponseCode code, T data) {
        final var failureResponse = new CommonResponse<T>();
        failureResponse.setCode(code.getCode());
        failureResponse.setMessage(code.getMessage());
        failureResponse.setData(data);
        return failureResponse;
    }

}
