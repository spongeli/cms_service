package com.spongeli.service.config.innit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 服务启动之后执行
 * @Description
 * @Author spongeli
 * @Date 2020/5/18 9:33
 **/
@Component
public class AfterServiceStarted implements ApplicationRunner {
    private static final Logger logger = LogManager.getLogger(AfterServiceStarted.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("启动之后执行了~120.53.121.96");
    }

}
