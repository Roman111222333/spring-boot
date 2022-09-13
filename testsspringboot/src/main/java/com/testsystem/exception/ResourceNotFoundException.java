package com.testsystem.exception;

/**
 * Created by roman.ali on 8/29/2022.
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
