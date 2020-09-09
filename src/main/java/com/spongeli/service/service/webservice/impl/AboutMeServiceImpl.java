package com.spongeli.service.service.webservice.impl;

import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.pojo.dao.CmsAboutMeMapper;
import com.spongeli.service.pojo.model.CmsAboutMe;
import com.spongeli.service.pojo.model.CmsAboutMeExample;
import com.spongeli.service.service.webservice.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AboutMeServiceImpl extends WebBaseService implements AboutMeService {

    @Autowired
    private CmsAboutMeMapper mapper;

    @Override
    public Object aboutMe() {
        CmsAboutMeExample example = new CmsAboutMeExample();
        List<CmsAboutMe> cmsAboutMes = mapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(cmsAboutMes)) {
            return new Object();
        }
        return cmsAboutMes.get(0);
    }
}
