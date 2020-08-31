package com.spongeli.service.common.system;

import com.spongeli.service.common.bean.RequestCommonTcfwUserBean;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/3/6 15:17
 **/
public class WebRequestHolder{
    // 保存当前线程的用户信息
    private static final ThreadLocal<RequestCommonTcfwUserBean> userHolder = new ThreadLocal<>();
    // 保存当前线程的request信息
    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();

    public static void  addAll(RequestCommonTcfwUserBean sysUser, HttpServletRequest request){
        userHolder.set(sysUser);
        requestHolder.set(request);
    }

    public static void add(RequestCommonTcfwUserBean sysUser){
        userHolder.set(sysUser);
    }

    public static void add(HttpServletRequest request){
        requestHolder.set(request);
    }

    public static RequestCommonTcfwUserBean getCurrentUser(){
        return userHolder.get();
    }

    public static HttpServletRequest getCurrentRequest(){
        return requestHolder.get();
    }

    public static void remove(){
        userHolder.remove();
        requestHolder.remove();
    }
}
