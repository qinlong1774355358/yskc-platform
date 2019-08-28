package com.zscat.mall.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"/dubbo-consumer.xml"})
public class MallApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApiApplication.class, args);
    }
}
