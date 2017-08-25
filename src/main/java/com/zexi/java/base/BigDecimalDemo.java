/**
 * 
 */
package com.zexi.java.base;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author yulele
 *
 * @time 2017年6月14日 上午10:07:01
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.22");
        BigDecimal b = new BigDecimal("2.22");
        BigDecimal c = a.add(b);
        System.out.println(c);
        Integer d = Integer.valueOf(1);
        AtomicStampedReference e = null;
    }

}
