package com.spongeli.service.common.system;

import com.spongeli.service.common.bean.RequestCommonAdminBean;

import javax.servlet.http.HttpServletRequest;

public class ManagerRequestHolder{
    // 保存当前线程的用户信息
    private static final ThreadLocal<RequestCommonAdminBean> userHolder = new ThreadLocal<>();
    // 保存当前线程的request信息
    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();

    public static void  addAll(RequestCommonAdminBean sysUser, HttpServletRequest request){
        userHolder.set(sysUser);
        requestHolder.set(request);
    }

    public static void add(RequestCommonAdminBean sysUser){
        userHolder.set(sysUser);
    }

    public static void add(HttpServletRequest request){
        requestHolder.set(request);
    }

    public static RequestCommonAdminBean getCurrentUser(){
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
