//package com.example.springbootdemo.controller;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @Author: wangcheng
// * @Description:
// * @Date: Created in 11/19/2021  10:39:08
// * @Modified By:
// **/
//@RestController
//@RequestMapping("login")
//public class LoginController {
//
//    @PostMapping("/doLogin")
//    public void doLogin(String username, String password) {
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(new UsernamePasswordToken(username, password));
//            System.out.println("登录成功!");
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//            System.out.println("登录失败!");
//        }
//    }
//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }
//    @GetMapping("/login")
//    public String  login() {
//        return "please login!";
//    }
//
//}
