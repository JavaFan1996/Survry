package com.atguigu.surveypark.test;

import com.atguigu.surveypark.model.User;
import com.atguigu.surveypark.service.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {



    private static UserService us;


    @BeforeClass
    public static void initUserService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        us = (UserService) ac.getBean("userService");

    }
    /**
     * 插入用户
     */
    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setEmail("839473624@qq.com");
        user.setPassword("123456");
        user.setNickName("fzq");
        us.saveEntity(user);
    }

    /**
     * 删除用户
     */

    @Test
    public void deleteUser(){
        User user = us.getEntity(1);
        System.out.println(user);


    }


}
