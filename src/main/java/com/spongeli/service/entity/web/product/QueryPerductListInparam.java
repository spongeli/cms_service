package com.spongeli.service.entity.web.product;

import com.spongeli.service.common.bean.PageHeplerInparam;

public class QueryPerductListInparam {
    private Integer tid;
    private PageHeplerInparam pageInfo;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public PageHeplerInparam getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageHeplerInparam pageInfo) {
        this.pageInfo = pageInfo;
    }
}
