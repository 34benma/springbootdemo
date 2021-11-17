package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
public class DemoController {


    @GetMapping("/hello")
    public String helloController() {
        return "Hello World";
    }

    @GetMapping("exception")
    public Object throwException() throws Exception{
        throw new Exception("this is a exception");
    }
}
