package com.spongeli.service.service.webservice.service;

import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.pojo.dao.CmsNavigationMapper;
import com.spongeli.service.pojo.model.CmsNavigationExample;
import com.spongeli.service.service.webservice.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl extends WebBaseService implements NavigationService {
    @Autowired
    private CmsNavigationMapper mapper;

    @Override
    public Object list() {
        CmsNavigationExample example = new CmsNavigationExample();
        example.createCriteria().andStatusEqualTo(SystemConstant.YES_STATUS);
        return mapper.selectByExample(example);
    }
}
