package org.rrd.product.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: ProductMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
@Mapper
public interface ProductMapper {
    List getList();

    List findOneById(String id);

    String getNow();
}
