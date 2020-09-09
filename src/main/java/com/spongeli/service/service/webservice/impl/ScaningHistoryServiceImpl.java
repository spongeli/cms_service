package com.spongeli.service.service.webservice.impl;

import com.spongeli.service.common.bean.AddressBean;
import com.spongeli.service.common.system.WebBaseService;
import com.spongeli.service.common.util.ServiceUtil;
import com.spongeli.service.entity.web.scaning.AddScaningHistoryInparam;
import com.spongeli.service.pojo.dao.CmsScaningHistroyMapper;
import com.spongeli.service.pojo.model.CmsScaningHistroy;
import com.spongeli.service.service.webservice.ProductService;
import com.spongeli.service.service.webservice.ScaningHistoryService;
import com.spongeli.service.utils.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ScaningHistoryServiceImpl extends WebBaseService implements ScaningHistoryService {

    @Autowired
    private CmsScaningHistroyMapper mapper;

    @Override
    public void add(AddScaningHistoryInparam inparam) {
        CmsScaningHistroy record = new CmsScaningHistroy();
        record.setSource(inparam.getSource());
        record.setScaningTitle(inparam.getScaningTitle());
        String ip = getCurrentIp();
        if("127.0.0.1".equals(ip)){
            ip = "117.157.129.182";
        }
        AddressBean bean = AddressUtil.getAddressBean(ip);
        record.setCity(bean.getCity());
        record.setProvince(bean.getProvince());
        record.setIp(ip);
        record.setScaningTime(new Date());
        record.setCreateTime(new Date());
        mapper.insert(record);
    }


}
