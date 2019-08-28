package com.zscat.oms;

import com.alibaba.dubbo.container.Main;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 订单服务启动类
 */
@SpringBootApplication
@Log4j2
@MapperScan(basePackages = "com.zscat.oms.mapper")
@ImportResource(locations = {"/dubbo-provider.xml","/dubbo-consumer.xml"})
@EnableTransactionManagement
public class OmsApplication {

    public static void main( String[] args ) {
        log.debug("oms-service启动start...");
        SpringApplication.run(OmsApplication.class, args); 
        Main.main(args);
        log.debug("oms-service启动end...");
    }
}