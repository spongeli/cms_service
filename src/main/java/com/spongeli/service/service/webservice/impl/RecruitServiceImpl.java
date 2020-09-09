package com.spongeli.service.service.webservice.impl;

import com.spongeli.service.common.cont.CmsContant;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.pojo.dao.CmsRecruitMapper;
import com.spongeli.service.pojo.model.CmsRecruitExample;
import com.spongeli.service.service.webservice.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruitServiceImpl extends WebBaseService implements RecruitService {

    @Autowired
    private CmsRecruitMapper mapper;

    @Override
    public Object list() {
        CmsRecruitExample example = new CmsRecruitExample();
        example.createCriteria().andStatusEqualTo(CmsContant.YES);
        return mapper.selectByExampleWithBLOBs(example);
    }
}
