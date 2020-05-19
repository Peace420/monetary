package org.rrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Description: EurekaStartApplication
 * date: 2020/5/19 14:15
 * author:
 * version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStartApplication.class);
    }
}
