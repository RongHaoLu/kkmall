package com.rh.kkmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KkmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkmallOrderApplication.class, args);
    }

}
