package com.spongeli.service.utils;

import com.spongeli.service.common.bean.AddressBean;
import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbSearcher;

public class AddressUtil {
    public static AddressBean getAddressBean(String ip) {
        // 根据IP搜索地址信息
        DbConfig config = null;
        AddressBean bean = new AddressBean();
        try {
            config = new DbConfig();
            String dbfile = "/relyon/ip2region.db"; // 这个文件若没有请到以下地址下载：
            // https://gitee.com/lionsoul/ip2region/tree/master/data
            DbSearcher searcher = new DbSearcher(config, dbfile);

            // B树搜索（更快）
            DataBlock block2 = searcher.btreeSearch(ip);
            String region = block2.getRegion();
            String[] split = region.split("\\|");
            if (split.length == 5) {
                bean.setCity(split[3]);
                bean.setProvince(split[2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
