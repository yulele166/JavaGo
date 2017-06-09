/**
 * 斐波那契数列
 * 
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月9日 下午5:45:45
 */
public class Fibonacci {

    //递归
    public static long F(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return F(n-1)+F(n-2);
    }
    
    //递推
    public static long fib(int n){
        int a = 0;
        int b = 1;
        int c = 0;//临时变量
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i = 2;i <= n;i ++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i+" "+fib(i));
        }
    }
}
