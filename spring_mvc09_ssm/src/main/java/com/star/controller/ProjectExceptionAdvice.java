package com.star.controller;

import com.star.controller.exception.BusinessException;
import com.star.controller.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public Result doOtherException(Exception e) {
        System.out.println("拦截到异常了。。。");
        return new Result(null,666,"拦截到异常了。。。");
    }

    @ExceptionHandler
    public Result doBusinessException(BusinessException be) {
        return new Result(null,be.getCode(),be.getMessage());
    }

    @ExceptionHandler
    public Result doSystemException(SystemException se) {
        return new Result(null,se.getCode(),se.getMessage());
    }


}
