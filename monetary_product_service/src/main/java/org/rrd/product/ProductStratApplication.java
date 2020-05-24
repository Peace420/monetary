package org.rrd.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: ProductStratApplication
 * date: 2020/5/19 14:50
 * author:
 * version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
<<<<<<< HEAD
@MapperScan("org.rrd.product.mapper")
=======
@MapperScan("org.rrd.market.mapper")
>>>>>>> 95524300c850d0489ab95f470a767bcd966b17d2
public class ProductStratApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductStratApplication.class);
    }
}
