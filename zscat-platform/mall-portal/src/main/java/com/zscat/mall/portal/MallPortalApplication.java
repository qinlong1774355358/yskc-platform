package com.zscat.mall.portal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.container.Main;

import lombok.extern.log4j.Log4j2;
import java.lang.reflect.Field;
/**
 * @author: zscat
 * @date: 2018/11/7 10:39
 * @description: 用户服务入口
 */
@SpringBootApplication
@Log4j2 
@ImportResource(locations = {"/dubbo-consumer.xml"})
@EnableTransactionManagement
public class MallPortalApplication {
    public static void main(String[] args ) { 
        SpringApplication.run(MallPortalApplication.class, args); 
        Main.main(args); 
    }
}