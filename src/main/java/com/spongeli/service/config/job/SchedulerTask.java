package com.spongeli.service.config.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author spongeli
 * @Date 2019/10/21 10:58
 **/
@Component
public class SchedulerTask {
    Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

//    @Autowired
//    private OrderService orderService;

    /**
     * @Scheduled(fixedRate = 6000)  ：上一次开始执行时间点之后 6 秒再执行。
     * @Scheduled(fixedDelay = 6000)：上一次执行完毕时间点之后 6 秒再执行。
     * <p>
     * <p>
     * 每天凌晨1点执行
     */
//    @Scheduled(cron = "0 0 1 * * ?")
    private void cleanUpHistory() {
        logger.info("每天凌晨1点执行任务【开始】");

        logger.info("每天凌晨1点执行任务【结束】");
    }

    /**
     * 每分钟执行一次
     */
//    @Scheduled(cron = "0 */1 * * * ?")
    private void updateOrderStatus() {
        logger.info("清理无效订单【开始】");
//        orderService.releaseInvalidOrder();
        logger.info("清理无效订单【结束】");
    }
}