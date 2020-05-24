package org.rrd.market.service;

import org.rrd.market.mapper.MarketMapper;
import org.rrd.system.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: MarketService
 * date: 2020/5/23 8:53
 * author: 朱忠涛
 * version: 1.0
 */
@Service
public class MarketService {

    @Autowired(required = false)
    private MarketMapper marketMapper;

    public Map uplan(int number) {
        // key 为几个月期限 value为利率
        Map<Integer, Double> returnMap = new HashMap<>();
        List<Product> list  = marketMapper.uplan();
        for (Product product : list) {
            Integer month = Integer.valueOf(product.getServiceDeadline());
            BigDecimal bigDecimal = new BigDecimal((number * product.getRete() * month / 12));
            returnMap.put(month,bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        return returnMap;
    }

    public List<Product> allProduct() {
        List<Product> productList = marketMapper.allProduct();
        for (Product product : productList) {
            double rate = new BigDecimal(product.getRete()*100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            product.setRete(rate);
        }
        return productList;
    }
}
