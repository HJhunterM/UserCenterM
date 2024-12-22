package com.dark.UserCenterM.service;

import com.dark.UserCenterM.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author mahongjian
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-11-27 22:41:35
*/
public interface UserService extends IService<User> {

    /**
     * 用户注释
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param request
     * @return  返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

}
