package org.rrd.product.service;

import org.rrd.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: Test
 * date: 2020/5/20 14:37
 * author:
 * version: 1.0
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List list() {
        return productMapper.getList();
    }

    public List findOneById(String id) {
        return productMapper.findOneById(id);
    }

    public String getNow() {
        return productMapper.getNow();
    }
}
