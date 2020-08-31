package com.spongeli.service.controller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/7/9 16:37
 **/
@RestController
public class HelloWordController extends BaseController {
    private static final Logger logger = LogManager.getLogger(HelloWordController.class);

    @GetMapping("/")
    public CommonResponse helloWord() {
        logger.info("你好：{}", "HelloWord");
        // 保存字符串
        return instanceSuccess();
    }
}
