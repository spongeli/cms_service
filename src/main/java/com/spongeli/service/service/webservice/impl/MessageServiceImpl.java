package com.spongeli.service.service.webservice.impl;

import com.spongeli.service.common.cont.CmsContant;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.entity.web.message.AddMessageInparam;
import com.spongeli.service.pojo.dao.CmsMessageMapper;
import com.spongeli.service.pojo.model.CmsMessage;
import com.spongeli.service.service.webservice.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageServiceImpl extends WebBaseService implements MessageService {

    @Autowired
    private CmsMessageMapper mapper;

    @Override
    public void add(AddMessageInparam inparam) {
        CmsMessage record = new CmsMessage();
        BeanUtils.copyProperties(inparam, record);
        record.setCreateTime(new Date());
        record.setIsRead(CmsContant.NO);
        mapper.insert(record);
    }
}
