package com.spongeli.service.service.webservice;

import com.spongeli.service.entity.web.news.QueryNewsListInparam;

public interface NewsService {
    Object list(QueryNewsListInparam inparam);

    Object getNewsById(Integer id);
}
