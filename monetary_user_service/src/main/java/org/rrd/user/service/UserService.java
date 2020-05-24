package org.rrd.user.service;

import org.rrd.system.pojo.User;
import org.rrd.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
/**
 * Created by luyubo on 2020/5/21.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByIdAndPassword(String id, String password) {
        return userMapper.findByIdAndPassword(id,password);
    }
=======
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

>>>>>>> 95524300c850d0489ab95f470a767bcd966b17d2
}
