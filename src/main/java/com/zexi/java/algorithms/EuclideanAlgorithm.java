/**
 * 欧几里德算法
 * 计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。
 * 否则，将p除以q得到于是r,p和q的最大公约数即为q和r的最大公约数。
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月9日 下午2:51:12
 */
public class EuclideanAlgorithm {

    public static int gcd(int p,int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(12,24));
    }
}
