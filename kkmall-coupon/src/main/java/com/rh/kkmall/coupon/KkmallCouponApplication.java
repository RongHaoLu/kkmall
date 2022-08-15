package com.rh.kkmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//开启注册与发现
@EnableDiscoveryClient

public class KkmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkmallCouponApplication.class, args);
    }

}
