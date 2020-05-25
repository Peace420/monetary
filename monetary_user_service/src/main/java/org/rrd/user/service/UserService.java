package org.rrd.user.service;

import org.rrd.system.pojo.User;
import org.rrd.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int zhuce(User user){


        return userMapper.zhuce(user);
    }


    public User login(User user){


        return userMapper.login(user);
    }

}
