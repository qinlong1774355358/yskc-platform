package com.zscat.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.container.Main;

import lombok.extern.log4j.Log4j2;

/**
 * 用户管理服务
 */
@SpringBootApplication
@Log4j2
@MapperScan(basePackages = "com.zscat.ums.mapper")
@ImportResource(locations = {"/dubbo-provider.xml"})
@Configuration
@ComponentScan({"com.zscat.ums"})
@EnableTransactionManagement
public class UmsApplication {

    public static void main( String[] args ) {
        SpringApplication.run(UmsApplication.class, args);
        Main.main(args);
    }
}