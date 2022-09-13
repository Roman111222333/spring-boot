package com.testsystem.exception;

/**
 * Created by roman.ali on 8/30/2022.
 */
public class ResourceAlreadyExists extends RuntimeException{
    public ResourceAlreadyExists(String message) {
        super(message);
    }
}
