package com.spongeli.service.service.webservice.impl;

import com.github.pagehelper.PageInfo;
import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.entity.web.product.QueryPerductListInparam;
import com.spongeli.service.pojo.dao.CmsProductMapper;
import com.spongeli.service.pojo.model.CmsProductExample;
import com.spongeli.service.service.webservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductServiceImpl extends WebBaseService implements ProductService {

    @Autowired
    private CmsProductMapper mapper;

    @Override
    public Object list(QueryPerductListInparam inparam) {
        setPageStartPage(inparam.getPageInfo());
        CmsProductExample example = new CmsProductExample();
        CmsProductExample.Criteria criteria = example.createCriteria();
        criteria.andCreateByEqualTo(SystemConstant.YES_STATUS);
        if (Objects.nonNull(inparam.getTid())) {
            criteria.andTidEqualTo(inparam.getTid());
        }
        return new PageInfo<>(mapper.selectByExample(example));
    }
}
