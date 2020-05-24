package org.rrd.user;

import org.apache.catalina.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: ProductStartApplication
 * date: 2020/5/19 14:34
 * author:
 * version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@MapperScan("org.rrd.user.mapper")
public class UserStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserStartApplication.class);
    }
}
