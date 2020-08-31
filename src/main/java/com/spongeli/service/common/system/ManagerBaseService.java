package com.spongeli.service.common.system;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/1/2 10:22
 **/
public class ManagerBaseService extends BaseService {
    // 获取当前用户信息
    protected Object getCurrentUser() {
        return ManagerRequestHolder.getCurrentUser();
    }

    // 获取当前用户信息的登陆token
    protected String getCurrentUserToken() {
        return ManagerRequestHolder.getCurrentUser().getToken();
    }

}
