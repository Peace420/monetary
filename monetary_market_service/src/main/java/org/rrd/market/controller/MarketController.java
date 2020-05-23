package org.rrd.market.controller;


import org.rrd.market.service.MarketService;
import org.rrd.system.pojo.Product;
import org.rrd.system.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Description: MarketController
 * date: 2020/5/20 14:37
 * author:
 * version: 1.0
 */
@RestController
@RequestMapping("market")
@CrossOrigin
public class MarketController {

    @Autowired
    private MarketService marketService;

    /**
     * description: 利率计算器 17.25
     * version: 1.0
     * date: 2020/5/22 12:19
     * author: 朱忠涛
     *
     * @Param: [number]
     * @return: org.rrd.system.result.Result
     */
    @RequestMapping(value = "/calculator",method = RequestMethod.POST)
    public Result calculator(@RequestParam("number")int number){
        if (number<1000 || number%1000!=0)
            return Result.error();
        Map map = marketService.uplan(number);
        return Result.success(map);
    }

    @RequestMapping(value = "/allProduct",method = RequestMethod.GET)
    public Result allProduct(){
        List<Product> productList = marketService.allProduct();
        return Result.success(productList);
    }
}
