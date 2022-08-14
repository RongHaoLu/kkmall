package com.rh.kkmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *  导入依赖
 *  配置
 *  1、配置数据源
 *  2、配置mybatis-plus相关信息
 *     1、数据库驱动
 *     2、配置数据源
 *     3、配置mybatis-plus
 *        1、使用@MapperScan
 *        2、告诉mybatis-plus，sql映射文件位置
 *
 *
 */
@SpringBootApplication
@MapperScan("com.rh.kkmall.product.dao")
public class KkmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkmallProductApplication.class, args);
    }

}
