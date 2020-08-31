package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.service.webservice.BannerService;
import com.spongeli.service.service.webservice.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/navs")
public class NavigationController extends BaseController {
    @Autowired
    private NavigationService service;

    /**
     * 获取菜单列表
     *
     * @return
     */
    @GetMapping("/list")
    private CommonResponse list(){
        return instanceSuccess(service.list());
    }
}
