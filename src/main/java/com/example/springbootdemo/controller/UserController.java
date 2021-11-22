package com.example.springbootdemo.controller;

import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/18/2021  15:24:58
 * @Modified By:
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("all")
    public List<UserBean> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("all2")
    public List<UserBean> getAllUser2() {
        return userMapper.getAllUser();
    }



    @GetMapping("add")
    public int addNewUser(String name, String address) {
        UserBean userBean = new UserBean();
        userBean.setUserName(name);
        userBean.setAddress(address);
        return userService.addUser(userBean);
    }
}
