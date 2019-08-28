package com.zscat.mall.admin.task;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.zscat.ums.service.LogisticInitService;
import com.zscat.ums.service.LogisticsService;

import lombok.extern.slf4j.Slf4j;

/** 
 * 订单超时取消并解锁库存的定时器
 */
@Component
@Slf4j
public class KuaiDITask {
    /**
     * 从快递100同步快递信息 每日上午9:20同步一次
     */
    @Scheduled(cron = "0 20 9 * * ?")
    private void logisticGrab() {
        log.info("从快递100同步快递信息 每日上午9:20同步一次");
    }

    /**
     * 早8-晚17才插入初始物流信息
     */
    @Scheduled(cron = "0 3/15 8-17 * 1-5 ?")
    private void logisticInit() {
        log.info("早8-晚17才插入初始物流信息");
    }
}
