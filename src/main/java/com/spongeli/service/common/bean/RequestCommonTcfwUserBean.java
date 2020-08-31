package com.spongeli.service.common.bean;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/7/9 17:17
 **/
public class RequestCommonTcfwUserBean {
    private String token;
    private String sessionKey;
    private String ip;
    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
