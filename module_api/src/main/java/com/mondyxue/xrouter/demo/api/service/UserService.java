package com.mondyxue.xrouter.demo.api.service;

import com.mondyxue.xrouter.demo.api.data.UserInfo;

/**
 * Demo service for userinfo
 * @author MondyXue <a href="mailto:mondyxue@gmail.com">E-Mail</a>
 */
public interface UserService{

    void login(long userId);
    void logout();

    boolean isLogin();
    UserInfo getUserInfo();

}
