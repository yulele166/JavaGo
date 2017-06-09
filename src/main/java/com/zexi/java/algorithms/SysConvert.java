/**
 * 进制转换
 * 
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月10日 上午11:37:08
 */
public class SysConvert {
    
    /**
     * 十进制->二进制
     */
    private static String decimalToBinary(int n) {
        String bin = "";
        for(int i = n; i > 0; i /= 2){
            bin = (i%2) + bin;
        }
        return bin;
    }
    
    /**
     *  十进制->八进制 
     */
    private static String decimalToOctal(int n) {
        String oc = "";
        for(int i = n; i > 0; i /= 8){
            oc = (i%8) + oc;
        }
        return oc;
    }
    
    /**
     *  十进制->十六进制 
     */
    private static String decimalToHex(int n) {
        String hex = "";
        for(int i = n; i > 0; i /= 16){
            switch(i%16){
            case 10:hex = "a" + hex;break;
            case 11:hex = "b" + hex;break;
            case 12:hex = "c" + hex;break;
            case 13:hex = "d" + hex;break;
            case 14:hex = "e" + hex;break;
            default:hex = (i%16) + hex;break;
        }
        }
        return hex;
    }
    
    /**
     *  十进制->二、八、十六进制 
     */
    private static String decimalToRadix(int n,int radix) {
        String x = "";
        for(int i = n; i > 0; i /= radix){
            if(radix==16){
                switch(i%radix){
                    case 10:x = "a" + x;break;
                    case 11:x = "b" + x;break;
                    case 12:x = "c" + x;break;
                    case 13:x = "d" + x;break;
                    case 14:x = "e" + x;break;
                    default:x = (i%radix) + x;break;
                }
            }else{
                x = (i%radix) + x;
            }
        }
        return x;
    }
    
    /**
     * 二进制->十进制 
     */
    private static int binaryToDecimal(int bin) {
        int power = 0;
        int result = 0;
        for(int i = bin;i > 0;i /= 10){
            result += (i%10)*Math.pow(2, power);
            power ++;
        }
        return result;

    }
    
    public static void main(String[] args) {
        
        System.out.println("1:"+Integer.toBinaryString(10));//十进制转二进制
        System.out.println("2:"+decimalToBinary(10));//十进制转二进制
        
        System.out.println("3:"+Integer.toOctalString(10));//十进制转八进制
        System.out.println("4:"+decimalToOctal(10));//十进制转八进制
        
        System.out.println("5:"+Integer.toHexString(2748));//十进制转十六进制
        System.out.println("6:"+decimalToHex(2748));//十进制转十六进制
        
        System.out.println("7:"+decimalToRadix(10, 2));//十进制转二进制
        System.out.println("8:"+decimalToRadix(10, 8));//十进制转八进制
        System.out.println("9:"+decimalToRadix(9, 16));//十进制转十六进制
        
        System.out.println("10:"+String.format("%d", 10));
        System.out.println("11:"+String.format("%o", 10));//十进制转八进制
        System.out.println("12:"+String.format("%x", 10));//十进制转十六进制
        
        System.out.println("13:"+Integer.valueOf("1010", 2));//二进制转十进制
        System.out.println("14:"+Integer.valueOf("abc", 16));//十六进制转十进制
        System.out.println("15:"+Integer.valueOf("27", 8));//八进制转十进制
        
        System.out.println("16:"+binaryToDecimal(1010));
    }

}
