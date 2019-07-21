package com.atguigu.surveypark.serviceimpl;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.User;
import com.atguigu.surveypark.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    @Resource(name="userDao")
    public void setDao(BaseDao<User> dao){
        super.setDao(dao);
    }

}
