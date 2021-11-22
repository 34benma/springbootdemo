package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/17/2021  17:23:46
 * @Modified By:
 **/
@RestController
@RequestMapping(value = "session")
public class HttpSessionController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("set")
    public Object set(HttpSession httpSession) {
        httpSession.setAttribute("user","spring-session");
        return httpSession.getAttribute("user");
    }

    @GetMapping("get")
    public Object get(HttpSession httpSession) {
        return httpSession.getAttribute("user") + ":" + serverPort;
    }
}
