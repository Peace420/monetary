package org.rrd.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.rrd.system.pojo.User;

/**
 * Description: MarketMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
@Mapper
public interface UserMapper {


    //注册
    public int zhuce(User user);

    //登录
    public User login(User user);
}
