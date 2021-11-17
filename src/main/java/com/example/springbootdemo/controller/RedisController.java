package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/15/2021  17:56:28
 * @Modified By:
 **/
@RestController("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;


    @GetMapping("test")
    public Object testRedis(String key) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,"1111wangcheng"+key);
        return valueOperations.get(key);
    }
}
