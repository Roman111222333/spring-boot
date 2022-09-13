package com.testsystem.exception;

import java.util.Date;

/**
 * Created by roman.ali on 8/30/2022.
 */
public class CustomException extends RuntimeException{
    public CustomException(Date date, String cxMessage, String message){
        super(message);
    }
}
