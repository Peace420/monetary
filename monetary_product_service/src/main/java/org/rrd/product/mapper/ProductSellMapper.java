package org.rrd.product.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.User;

import java.util.List;

@Mapper
public interface ProductSellMapper {

    User selectById(String id);
}
