/**
 * 十进制转化为二进制表示 
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月9日 下午4:47:29
 */
public class IntegerToBinary {
    
    public static String decbin(int n){
        String s = "";
        for(int i = n; i > 0; i /= 2){
            s = (i % 2) + s;
        }
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println(decbin(10));
        System.out.println(Integer.parseInt("1010", 2));
    }

}
