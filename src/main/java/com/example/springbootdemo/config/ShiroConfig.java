//package com.example.springbootdemo.config;
//
//import com.example.springbootdemo.shiro.MyRealm;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @Author: wangcheng
// * @Description:
// * @Date: Created in 11/19/2021  10:28:55
// * @Modified By:
// **/
//@Configuration
//public class ShiroConfig {
//
//    @Bean
//    public MyRealm myRealm() {
//        return new MyRealm();
//    }
//
//    @Bean
//    public DefaultWebSecurityManager securityManager() {
//        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
//        manager.setRealm(myRealm());
//        return manager;
//    }
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
//        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
//        bean.setSecurityManager(securityManager());
//        bean.setLoginUrl("/login");
//        bean.setSuccessUrl("/index");
//        bean.setUnauthorizedUrl("/unauthorizedurl");
//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("/doLogin", "anon");
//        map.put("/**", "authc");
//        bean.setFilterChainDefinitionMap(map);
//        return bean;
//    }
//}
