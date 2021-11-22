package com.example.springbootdemo.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/17/2021  09:24:06
 * @Modified By:
 **/
@Service
public class CacheTestService {

    @Cacheable(value= "test_cacheConfig")
    public String testCacheConfig() {
        return "test_cache";
    }

    @CachePut(value = "testCacheConfig")
    public String addCache() {
        return "test_cache_add"+ Math.random();
    }



}
