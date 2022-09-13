package com.testsystem.exception;

/**
 * Created by roman.ali on 8/30/2022.
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message){
        super(message);
    }
}
