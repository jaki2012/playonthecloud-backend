package com.tongji409.web.service;

import com.tongji409.domain.User;
import com.tongji409.web.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author lijiechu
 * @create on 16/12/3
 * @description
 */
@Service
@Scope("prototype")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insert(user.getUserId(),user.getNickname(),user.getPassword(),user.getNickname());
    }

}
