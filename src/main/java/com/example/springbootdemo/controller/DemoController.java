package com.example.springbootdemo.controller;

import cn.wantedonline.starter.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@Api("demo测试")
public class DemoController {

    @Autowired
    private HelloService helloService;

    @GetMapping("sayHello")
    @ApiOperation("测试SayHello")
    public String getHelloService(@ApiParam("测试参数") String name) {

        return helloService.sayHello();
    }

    @GetMapping("/hello")
    public String helloController() {
        return "Hello World";
    }

    @GetMapping("admin")
    public String admin() {
        return "Hello, Admin,JWT";
    }

    @GetMapping("exception")
    public Object throwException() throws Exception{
        throw new Exception("this is a exception");
    }
}
