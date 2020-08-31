package com.spongeli.service.utils;

import com.spongeli.service.common.exception.SystemException;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/6/15 16:18
 **/
public class CheckUtil {

    /**
     * 数字不是空
     *
     * @param obj
     * @param errMsg
     */
    public static void isNotNull(Integer obj, String errMsg) {
        if (Objects.isNull(obj)) {
            throw new SystemException(errMsg);
        }
    }

    /**
     * 数字不是空
     *
     * @param obj
     * @param errMsg
     */
    public static void isNotNull(BigDecimal obj, String errMsg) {
        if (Objects.isNull(obj)) {
            throw new SystemException(errMsg);
        }
    }

    /**
     * 数字不是空
     *
     * @param obj
     * @param errMsg
     */
    public static void isNotNull(Byte obj, String errMsg) {
        if (Objects.isNull(obj)) {
            throw new SystemException(errMsg);
        }
    }

    /**
     * 对象不是空
     *
     * @param obj
     * @param errMsg
     */
    public static void isNotNull(Objects obj, String errMsg) {
        if (Objects.isNull(obj)) {
            throw new SystemException(errMsg);
        }
    }

    /**
     * 集合不为空
     *
     * @param collection
     */
    public static void isNotCollection(Collection<?> collection, String errMsg) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new SystemException(errMsg);
        }
    }
}
