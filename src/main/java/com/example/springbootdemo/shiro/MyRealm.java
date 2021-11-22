//package com.example.springbootdemo.shiro;
//
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//
///**
// * @Author: wangcheng
// * @Description:
// * @Date: Created in 11/19/2021  10:18:42
// * @Modified By:
// **/
//public class MyRealm extends AuthorizingRealm {
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        return null;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        String username = (String) authenticationToken.getPrincipal();
//        if (!"wangcheng".equals(username)) {
//            throw new UnknownAccountException("账户不存在!");
//        }
//        return new SimpleAuthenticationInfo(username, "123", getName());
//    }
//}
