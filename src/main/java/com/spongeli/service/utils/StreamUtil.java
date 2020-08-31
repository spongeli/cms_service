package com.spongeli.service.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/6/17 18:38
 **/
public class StreamUtil {

    // 去重
    // //        List<MallCoupon> list = allCouponList.stream().filter(StreamUtil.distinctByKey((p) -> (p.getCouponId()))).collect(Collectors.toList());
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
