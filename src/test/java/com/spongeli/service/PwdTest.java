package com.spongeli.service;

import com.spongeli.service.utils.MD5Util;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/7/17 8:57
 **/
public class PwdTest {

    public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void testPwd() {
        String pwd = "123456";
        System.out.println(MD5Util.getMD5("service-login-key-123456"));
    }

    @Test
    public void testDate() throws ParseException {
//        QueryPayOrderInparam inparam = new QueryPayOrderInparam();
//        inparam.setTime(format.parse("2020-06-01 12:12:12"));
//        getStartTimeByInparam(inparam);
        getEndTimeByInparam(format.parse("2020-05-01 12:12:12"));
    }

//    private Date getStartTimeByInparam(QueryPayOrderInparam inparam) {
//        Calendar inparamDate = Calendar.getInstance();
//        inparamDate.setTime(inparam.getTime());
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, inparamDate.get(Calendar.YEAR));
//        calendar.set(Calendar.MONTH, inparamDate.get(Calendar.MONTH));
//        calendar.set(Calendar.DAY_OF_MONTH, 1);
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 1);
//        return calendar.getTime();
//    }

    private Date getEndTimeByInparam(Date startTime) {
        Calendar inparamDate = Calendar.getInstance();
        inparamDate.setTime(startTime);
        inparamDate.set(Calendar.DAY_OF_MONTH, inparamDate.getActualMaximum(Calendar.DAY_OF_MONTH));
        inparamDate.set(Calendar.HOUR_OF_DAY, 23);
        inparamDate.set(Calendar.MINUTE, 59);
        inparamDate.set(Calendar.SECOND, 59);
        System.out.println(format.format(inparamDate.getTime()));
        return inparamDate.getTime();
    }

}
