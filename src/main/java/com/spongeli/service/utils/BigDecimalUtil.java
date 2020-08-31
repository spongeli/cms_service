package com.spongeli.service.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {
    /**
     * 提供精确加法计算的add方法（例：1+2，1是被加数，2是加数）
     *
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static String add(String value1, String value2) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return add(b1, b2).toString();
    }

    public static BigDecimal add(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }

    /**
     * 提供精确减法运算的sub方法（例：1-2,1是被减数，2是减数）
     *
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public static String sub(String value1, String value2) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return sub(b1, b2).toString();
    }

    public static BigDecimal sub(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }

    /**
     * 提供精确乘法运算的mul方法（例：1*2,1是被乘数，2是乘数）
     *
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static String mul(String value1, String value2) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return mul(b1, b2).toString();
    }

    public static BigDecimal mul(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    /**
     * 提供精确的除法运算方法div（例：1÷2，1是被除数，2是除数）
     *
     * @param value1 被除数
     * @param value2 除数
     * @param scale  精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
    public static String div(String value1, String value2, int scale) throws IllegalAccessException {
        //如果精确范围小于0，抛出异常信息
        if (scale < 0) {
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        //指定枚举类型，可以指定RoundingMode的8种枚举类型之一，对这8种枚举类型如果有疑问，可以参考上面RoundingMode的总结和描述。
        //这里指定的DOWN，对应RoundingMode的ROUND_DOWN模式，会直接舍去精确度后面的数值。
        return b1.divide(b2, scale, RoundingMode.DOWN).toString();
    }
}
