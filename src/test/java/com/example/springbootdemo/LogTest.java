package com.example.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LogTest {

    @Test
    public void contextLoad() {
        log.trace("this is trace logger");
        log.debug("this is debug logger");
        log.info("this is info logger");
        log.warn("this is warn logger");
        log.error("this is error logger");
    }

}
