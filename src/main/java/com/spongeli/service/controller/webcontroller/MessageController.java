package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.entity.web.message.AddMessageInparam;
import com.spongeli.service.service.webservice.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/api/messages")
public class MessageController extends BaseController {

    @Autowired
    private MessageService service;


    /**
     * 获取轮播图列表
     *
     * @return
     */
    @PostMapping("/add")
    private CommonResponse add(@RequestBody @Validated AddMessageInparam inparam){
        service.add(inparam);
        return instanceSuccess();
    }
}
