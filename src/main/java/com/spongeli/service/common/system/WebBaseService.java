package com.spongeli.service.common.system;

import com.spongeli.service.common.bean.RequestCommonTcfwUserBean;
import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.exception.SystemException;
import com.spongeli.service.common.util.ServiceUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/4/17 11:15
 **/
public class WebBaseService extends BaseService {

    // 获取当前用户信息
    protected RequestCommonTcfwUserBean getCurrentUser() {
        RequestCommonTcfwUserBean currentUser = WebRequestHolder.getCurrentUser();
        if (Objects.isNull(currentUser)) {
            throw new SystemException(SystemConstant.LOGIN_EXPIRE, "当前用户没登录");
        }
        return currentUser;
    }

    protected Integer getCurrentUserId() {
//        return getCurrentUser().getUserId();
        return null;
    }

    // 获取当前用户信息的登陆token
    protected String getCurrentUserToken() {
        return Objects.isNull(WebRequestHolder.getCurrentUser()) ? "" : WebRequestHolder.getCurrentUser().getToken();
    }

    /**
     * 获取当前线程的访问IP
     *
     * @return
     */
    protected String getCurrentIp() {
        return ServiceUtil.getIpAddr(WebRequestHolder.getCurrentRequest());
    }

    /**
     * 获取当前线程的request
     *
     * @return
     */
    protected HttpServletRequest getRequest() {
        return WebRequestHolder.getCurrentRequest();
    }

}
