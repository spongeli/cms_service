package com.spongeli.service.controller.webcontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.entity.web.news.QueryNewsListInparam;
import com.spongeli.service.entity.web.product.QueryPerductListInparam;
import com.spongeli.service.service.webservice.NavigationService;
import com.spongeli.service.service.webservice.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/api/news")
public class NewsController extends BaseController {

    @Autowired
    private NewsService service;

    /**
     * 获取新闻列表
     *
     * @return
     */
    @PostMapping("/list")
    private CommonResponse list(@RequestBody QueryNewsListInparam inparam) {
        return instanceSuccess(service.list(inparam));
    }

    @GetMapping("/{id}")
    private CommonResponse getNewsById(@PathVariable("id") Integer id) {
        return instanceSuccess(service.getNewsById(id));
    }
}
