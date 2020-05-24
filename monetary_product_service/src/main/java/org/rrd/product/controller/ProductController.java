package org.rrd.product.controller;

import org.rrd.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Description: Test
 * date: 2020/5/20 14:37
 * author:
 * version: 1.0
 */
@RestController
@RequestMapping(value = "/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List list(){
        return productService.list();
    }

    @GetMapping("findOneById")
    public List findOneById(@RequestParam(name = "id")String id){
        return productService.findOneById(id);
    }

    @GetMapping("getNow")
    public String getNow(){
        String now = productService.getNow().substring(0,8);
        return now;
    }
}
