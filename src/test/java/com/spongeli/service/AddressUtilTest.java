package com.spongeli.service;

import com.alibaba.fastjson.JSON;
import com.spongeli.service.common.bean.AddressBean;
import com.spongeli.service.utils.AddressUtil;
import org.junit.Test;
import org.lionsoul.ip2region.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AddressUtilTest {

    @Test
    public void addresstest() throws DbMakerConfigException, IOException {
        String ip = "117.157.129.182";
        AddressBean addressBean = AddressUtil.getAddressBean(ip);
        System.out.println(JSON.toJSONString(addressBean));
    }
}


