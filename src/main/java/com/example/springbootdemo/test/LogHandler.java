package com.example.springbootdemo.test;

import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
    @Setter
    private Object target;

    public Object getProxy() {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Log Method execute...");
        return method.invoke(target, args);
    }
}
