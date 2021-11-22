package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.UserBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: wangcheng
 * @Description:
 * @Date: Created in 11/18/2021  16:15:23
 * @Modified By:
 **/
public interface UserMapper {

    @Select("select * from user")
    List<UserBean> getAllUser();


}
