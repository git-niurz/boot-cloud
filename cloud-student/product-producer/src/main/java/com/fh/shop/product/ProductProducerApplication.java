package com.fh.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.fh.shop.product.mapper")
@EnableFeignClients("com.fh.shop.brand.api")
public class ProductProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductProducerApplication.class, args);
    }
}
