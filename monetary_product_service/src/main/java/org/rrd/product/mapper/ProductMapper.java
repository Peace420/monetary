package org.rrd.product.mapper;

import java.util.List;

/**
 * Description: ProductMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
public interface ProductMapper {
    List getList();

    List findOneById(String id);

    String getNow();
}
