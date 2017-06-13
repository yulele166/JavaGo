/**
 * 汉诺塔  递归实现
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年6月13日 下午2:53:19
 */
public class Hanoi {
    
    public static void main(String[] args) {
        move('a','b','c',2);
    }

    /**
     * 
     * @param n  盘子数
     * @param a  源座
     * @param b  辅助座
     * @param c  目标座
     */
    public static void move(char a,char b,char c,int n) {
        if(n==1){
            System.out.printf("Move disk %d from %c to %c\n",n,a,c);
        }else{
            move(a,b,c,n-1);
            System.out.printf("Move disk %d from %c to %c\n",n,a,c);
            move(b,a,c,n-1);
        }

    }
}
