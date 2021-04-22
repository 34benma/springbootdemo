package com.example.springbootdemo.test;

public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        LogHandler logHandler = new LogHandler();
        logHandler.setTarget(userService);
        UserService proxy = (UserService) logHandler.getProxy();
        proxy.add();

    }
}
