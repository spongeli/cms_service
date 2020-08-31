package com.spongeli.service.service.webservice.service;

import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.system.BaseService;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.pojo.dao.CmsBannerMapper;
import com.spongeli.service.pojo.model.CmsBannerExample;
import com.spongeli.service.service.webservice.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl extends WebBaseService implements BannerService {

    @Autowired
    private CmsBannerMapper mapper;

    /**
     * 获取轮播图列表
     *
     * @return
     */
    @Override
    public Object list() {
        CmsBannerExample example = new CmsBannerExample();
        example.createCriteria().andIsdeleteEqualTo(SystemConstant.YES);
        mapper.selectByExample(example);
        return mapper.selectByExample(example);
    }
}
