/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package cjz.eureka.client;

public class BaseResponse<T> {
    private boolean succ;
    private String errorCode;
    private String errorMessage;

    private T body;

    public BaseResponse() {
    }

    public BaseResponse(boolean succ, String errorCode, String errorMessage, T body) {
        this.succ = succ;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.body = body;
    }

    public static <T> BaseResponse<T> newSuccResponse(T body) {
        return new BaseResponse<>(true, "00", null, body);
    }

    public static <T> BaseResponse<T> newFailedResponse(String errorCode, String errorMessage) {
        return new BaseResponse<>(false, errorCode, errorMessage, null);
    }

    public boolean isSucc() {
        return succ;
    }

    public void setSucc(boolean succ) {
        this.succ = succ;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseResponse{");
        sb.append("succ=").append(succ);
        sb.append(", errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", body=").append(body);
        sb.append('}');
        return sb.toString();
    }
}
