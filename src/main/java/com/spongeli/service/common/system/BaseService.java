package com.spongeli.service.common.system;

import com.github.pagehelper.PageHelper;
import com.spongeli.service.common.bean.PageHeplerInparam;
import com.spongeli.service.common.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected RedisUtil redisUtil;

    // 设置分页信息
    protected void setPageStartPage(int pageSize, int pageCurrentPage, String orderby) {
        PageHeplerInparam inparam = new PageHeplerInparam();
        inparam.setPageSize(pageSize);
        inparam.setPageCurrentPage(pageCurrentPage);
        setPageStartPage(inparam, orderby);
    }

    // 设置分页信息
    protected void setPageStartPage(PageHeplerInparam inparam) {
        PageHelper.startPage(inparam.getPageCurrentPage(), inparam.getPageSize());
    }

    // 设置分页信息
    protected void setPageStartPage(PageHeplerInparam inparam, String orderby) {
        PageHelper.startPage(inparam.getPageCurrentPage(), inparam.getPageSize(), orderby);
    }
}
