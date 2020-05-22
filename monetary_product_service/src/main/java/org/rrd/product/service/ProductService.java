package org.rrd.product.service;

import org.rrd.product.fegin.RateService;
import org.rrd.product.mapper.ProductMapper;
import org.rrd.system.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description: ProductService
 * date: 2020/5/21 15:40222
 * author: 朱忠涛
 * version: 1.0
 */
@Service
public class ProductService {

    @Autowired(required = false)
    private RateService rateService;

    @Autowired(required = false)
    private ProductMapper productMapper;

    public Map uplan(int number) {
        // key 为几个月期限 value为利率
        Map<Integer, Double> returnMap = new HashMap<>();
        List<Product> list  = productMapper.uplan();
        for (Product product : list) {
            Integer month = Integer.valueOf(product.getService_deadline());
            BigDecimal bigDecimal = new BigDecimal((number * product.getRate() * month / 12));
            returnMap.put(month,bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        return returnMap;
    }

    public List<Product> allProduct() {
        List<Product> productList = productMapper.allProduct();
        for (Product product : productList) {
            double rate = new BigDecimal(product.getRate()*100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            product.setRate(rate);
        }
        return productList;
    }
}
