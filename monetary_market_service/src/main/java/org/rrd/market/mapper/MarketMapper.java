package org.rrd.market.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Product;

import java.util.List;


@Mapper
public interface MarketMapper {

    List<Product> uplan();

    List<Product> allProduct();
}
