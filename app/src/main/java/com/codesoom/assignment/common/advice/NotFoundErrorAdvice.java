package com.codesoom.assignment.common.advice;

import com.codesoom.assignment.common.dto.ErrorResponse;
import com.codesoom.assignment.common.exceptions.DuplicateUserException;
import com.codesoom.assignment.common.exceptions.ProductNotFoundException;
import com.codesoom.assignment.common.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundErrorAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public ErrorResponse handleProductTaskNotFound() {
        return new ErrorResponse("Product not found");
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public ErrorResponse handleUserNotFound(UserNotFoundException exception) {
        return new ErrorResponse(exception.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(DuplicateUserException.class)
    public ErrorResponse handleDuplicateUser(DuplicateUserException exception) {
        return new ErrorResponse(exception.getMessage());
    }

}
