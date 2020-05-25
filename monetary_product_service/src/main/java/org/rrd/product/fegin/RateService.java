package org.rrd.product.fegin;

import org.rrd.product.fegin.Impl.RateServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Description: RateService 22
 * date: 2020/5/21 15:48
 * author: 朱忠涛
 * version: 1.0
 */
@FeignClient(name = "monetary_rate_service",fallback = RateServiceImpl.class)
public interface RateService{

    @RequestMapping("/rate/uplan")
    Map uplan(int number);
}