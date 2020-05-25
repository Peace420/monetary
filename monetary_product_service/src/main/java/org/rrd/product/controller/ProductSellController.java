package org.rrd.product.controller;

import org.rrd.product.service.ProductSellService;
import org.rrd.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hujie
 * @data
 */
@RestController
@RequestMapping("product/pc")
public class ProductSellController {

    @Autowired
    private ProductSellService productSellService;

    @GetMapping("/test")
    public void test(@RequestBody User user){
        productSellService.sell(user);
    }
}
