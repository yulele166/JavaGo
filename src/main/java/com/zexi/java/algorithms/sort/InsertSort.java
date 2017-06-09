/**
 * 插入排序
 */
package com.zexi.java.algorithms.sort;

/**
 * @author yulele
 *
 * @time 2017年5月18日 下午3:11:20
 */
public class InsertSort {

    /**
     * 
     */
    private static void insertSort(int[] a) {
        int temp = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                temp = a[i];
                int j;
                for(j=i-1;j>=0&&a[j]>temp;j--){
                    a[j+1] = a[j];
                }
                a[j+1] = temp;
            }
        }

    }
    
    public static void main(String[] args) {
        int[] a = {10,9,8,9,11,12,5,6};
        insertSort(a);
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
