package com.spongeli.service.service.webservice.impl;

import com.github.pagehelper.PageInfo;
import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.entity.web.news.QueryNewsListInparam;
import com.spongeli.service.pojo.dao.CmsNewsMapper;
import com.spongeli.service.pojo.model.CmsNews;
import com.spongeli.service.pojo.model.CmsNewsExample;
import com.spongeli.service.service.webservice.NewsService;
import com.spongeli.service.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl extends WebBaseService implements NewsService {

    @Autowired
    private CmsNewsMapper mapper;

    @Override
    public Object list(QueryNewsListInparam inparam) {
        String orderby = "create_time desc";
        setPageStartPage(inparam.getPageInfo(), orderby);
        CmsNewsExample example = new CmsNewsExample();
        example.setOrderByClause(orderby);
        CmsNewsExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(SystemConstant.YES_STATUS);
        if (StringUtils.isNotEmpty(inparam.getNewsType())) {
            criteria.andNewsTypeEqualTo(inparam.getNewsType());
        }
        List<CmsNews> cmsNews = mapper.selectByExampleWithBLOBs(example);
        return new PageInfo<>(cmsNews);
    }

    @Override
    public Object getNewsById(Integer id) {
        CmsNews news = mapper.selectByPrimaryKey(id);
        CmsNews record = new CmsNews();
        record.setId(id);
        record.setScanNum(news.getScanNum() + 1);
        mapper.updateByPrimaryKeySelective(record);
        return news;
    }
}
