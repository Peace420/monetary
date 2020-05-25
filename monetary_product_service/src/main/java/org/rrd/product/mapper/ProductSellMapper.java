package org.rrd.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Product;
import org.rrd.system.pojo.User;

import java.util.List;

@Mapper
public interface ProductSellMapper extends BaseMapper<User> {

}
