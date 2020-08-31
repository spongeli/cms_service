package com.spongeli.service.service.commonservice;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;

public interface CommonService {
    boolean checkVerifyCode(HttpServletRequest request, String verify);

    void sendVerify(String username, HttpServletRequest request);

    String genOrderNoByRedis(String redisInc,String prefix);

    JSONObject logisticsSearch(String logisticsNo);
}
