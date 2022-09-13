package com.testsystem.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Created by roman.ali on 8/29/2022.
 */
public class ErrorDetail {
    private LocalDateTime timeStamp;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    String message;
    private String errorCode;


    public ErrorDetail(LocalDateTime timeStamp, String message, String errorCode) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorDetail() {

    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}