/**
 * 计算ln(N!)
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月11日 上午10:25:50
 */
public class LogarithmOfFactorial {
    /**
     * 求阶乘
     */
    private static long fac(int n) {
        
        if(n==0||n==1) return 1;
        
        return n * fac(n-1);

    }
    
    public static void main(String[] args) {
        System.out.println(fac(10));
        System.out.println(Math.log(fac(10)));
    }

}
