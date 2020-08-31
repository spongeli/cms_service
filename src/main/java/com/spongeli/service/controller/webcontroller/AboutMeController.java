package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.service.webservice.AboutMeService;
import com.spongeli.service.service.webservice.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/aboutme")
public class AboutMeController extends BaseController {

    @Autowired
    private AboutMeService service;

    /**
     * 获取关于我们信息
     *
     * @return
     */
    @GetMapping("/getinfo")
    private CommonResponse aboutMe(){
        return instanceSuccess(service.aboutMe());
    }
}
