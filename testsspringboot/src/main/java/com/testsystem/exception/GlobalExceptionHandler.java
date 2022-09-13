package com.testsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


/**
 * Created by roman.ali on 8/29/2022.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorDetail> customExceptio(CustomException cx) {
        ErrorDetail detail = new ErrorDetail();
        detail.setErrorCode("BAD_REQUEST");
        detail.setMessage(cx.getMessage());
        detail.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetail>(detail, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(ResourceAlreadyExists.class)
    public ResponseEntity<ErrorDetail> resourceExists(CustomException ex) {
        ErrorDetail detail = new ErrorDetail();
        detail.setErrorCode("CONFLICT");
        detail.setMessage(ex.getMessage());
        detail.setTimeStamp(LocalDateTime.now());
        return new ResponseEntity<ErrorDetail>(detail, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetail> resourceExists(ResourceNotFoundException rnf) {
        ErrorDetail detail = new ErrorDetail();
        detail.setErrorCode("NOT_FOUND");
        detail.setMessage(rnf.getMessage());
        detail.setTimeStamp(LocalDateTime.now());
        return new ResponseEntity<ErrorDetail>(detail, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorDetail> resourceExists(UnauthorizedException ue) {
        ErrorDetail detail = new ErrorDetail();
        detail.setErrorCode("UNAUTHORIZED");
        detail.setMessage(ue.getMessage());
        detail.setTimeStamp(LocalDateTime.now());
        return new ResponseEntity<ErrorDetail>(detail, HttpStatus.UNAUTHORIZED);
    }

}
