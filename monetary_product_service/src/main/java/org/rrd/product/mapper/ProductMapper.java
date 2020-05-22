package org.rrd.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Product;

import java.util.List;

/**
 * Description: ProductMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
@Mapper
public interface ProductMapper {
    List<Product> uplan();
}
