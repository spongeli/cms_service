package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.bean.PageHeplerInparam;
import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.entity.web.product.QueryPerductListInparam;
import com.spongeli.service.service.webservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/api/product")
public class ProductController extends BaseController {
    @Autowired
    private ProductService service;

    /**
     * 获取产品列表
     *
     * @return
     */
    @PostMapping("/list")
    private CommonResponse list(@RequestBody QueryPerductListInparam inparam){
        return instanceSuccess(service.list(inparam));
    }
}
