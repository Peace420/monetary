package org.rrd.market.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Product;

import java.util.List;

/**
 * Description: MarketMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
@Mapper
public interface MarketMapper {

    List<Product> uplan();

    List<Product> allProduct();
}
