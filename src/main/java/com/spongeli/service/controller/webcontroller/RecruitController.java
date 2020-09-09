package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.entity.web.product.QueryPerductListInparam;
import com.spongeli.service.service.webservice.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/api/recruit")
public class RecruitController  extends BaseController {
    @Autowired
    private RecruitService service;

    /**
     * 获取产品列表
     *
     * @return
     */
    @GetMapping("/list")
    private CommonResponse list(){
        return instanceSuccess(service.list());
    }
}
