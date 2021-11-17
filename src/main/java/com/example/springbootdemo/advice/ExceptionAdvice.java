package com.example.springbootdemo.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/15/2021  09:27:44
 * @Modified By:
 **/

@Slf4j
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public String testExceptionHandler(Exception e) {
        log.error("----exception----",e);
        return "error";
    }
}
