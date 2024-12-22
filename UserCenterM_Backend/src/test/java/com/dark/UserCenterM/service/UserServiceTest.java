package com.dark.UserCenterM.service;
import java.util.Date;

import com.dark.UserCenterM.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * author: darkHunter
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserAccount("123");
        user.setUserName("dog");
        user.setAvatarUrl("https://i2.hdslb.com/bfs/face/4ba436822ec82c93b62ec96bd5f2293b91642746.jpg@240w_240h_1c_1s_!web-avatar-nav.avif");
        user.setGender(0);
        user.setUserPassword("hxxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "dark";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "777";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "ddf";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "dark";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "dark hm";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "dog";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "dark";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
    }
}