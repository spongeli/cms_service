package com.spongeli.service.common.cont;

/**
 * @Description
 * @Author spongeli
 * @Date 2019/12/26 9:07
 **/
public interface SystemConstant {
    // 返回状态码
    int SUCCESS = 200;
    int FAIL = 400;
    int LOGIN_EXPIRE = 300; // 登陆过期

    Byte YES = (byte)0; // 上架
    Byte NO = (byte)1;  // 下架
    Byte DELETE = (byte)2; // 删除

    String YES_STATUS = "Y";
    String NO_STATUS = "N";

//    String IMG_URL = "http://www.lykji.shop/upload/";
    String IMG_URL = "https://www.shaliy.vip/upload/";
//    String IMG_URL = "http://127.0.0.1:9000/upload/";
}
