package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.entity.web.message.AddMessageInparam;
import com.spongeli.service.entity.web.scaning.AddScaningHistoryInparam;
import com.spongeli.service.service.webservice.ScaningHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/scaning")
public class ScaningHistoryController extends BaseController {

    @Autowired
    private ScaningHistoryService service;


    /**
     * 获取轮播图列表
     *
     * @return
     */
    @PostMapping("/add")
    private CommonResponse add(@RequestBody @Validated AddScaningHistoryInparam inparam){
        service.add(inparam);
        return instanceSuccess();
    }
}
