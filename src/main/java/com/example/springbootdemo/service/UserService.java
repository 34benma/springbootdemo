package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/18/2021  15:15:10
 * @Modified By:
 **/
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addUser(UserBean user) {
        return jdbcTemplate.update("insert into user (username,address) values (?,?);", user.getUserName(), user.getAddress());
    }

    public List<UserBean> getAllUser() {
        return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(UserBean.class));
    }
}
