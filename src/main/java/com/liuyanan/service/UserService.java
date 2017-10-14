package com.liuyanan.service;

import com.liuyanan.dao.UserMapper;
import com.liuyanan.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songliangliang on 2017/10/14.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void insertUser() {
        User user = new User();
        user.setAccount("1233");
        userMapper.insertSelective(user);
    }
}
