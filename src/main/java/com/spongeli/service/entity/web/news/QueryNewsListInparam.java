package com.spongeli.service.entity.web.news;

import com.spongeli.service.common.bean.PageHeplerInparam;

public class QueryNewsListInparam {
    private String newsType;
    private PageHeplerInparam pageInfo;

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public PageHeplerInparam getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageHeplerInparam pageInfo) {
        this.pageInfo = pageInfo;
    }
}
