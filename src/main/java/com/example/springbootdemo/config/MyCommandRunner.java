package com.example.springbootdemo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/18/2021  14:29:32
 * @Modified By:
 **/
@Component
@Order(100)
public class MyCommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandRunner running....");
    }
}
