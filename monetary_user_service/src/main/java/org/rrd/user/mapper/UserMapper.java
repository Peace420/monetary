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
public interface UserMapper {
    User findByIdAndPassword(@Param("id") String id, @Param("password") String password);
}
