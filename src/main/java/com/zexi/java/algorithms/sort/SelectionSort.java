/**
 * 选择排序
 */
package com.zexi.java.algorithms.sort;

/**
 * @author yulele
 *
 * @time 2017年5月18日 上午11:57:50
 */
public class SelectionSort {
    
    /**
     * 遍历一次获取一个最小值
     */
    private static void selectionSort(int[] a) {
        int min = 0;
        int temp = 0;
        // 需要遍历获得最小值的次数
        // 要注意一点，当要排序 N 个数，已经经过 N-1 次遍历后，已经是有序数列
        for(int i = 0;i < a.length-1;i++){
            min = i;// 用来保存最小值得索引
            // 寻找第i个小的数值
            for(int j = i + 1;j < a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            if(i!=min){
            	// 将找到的第i个小的数值放在第i个位置上
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }

    }
    
    public static void main(String[] args) {
        int[] a = {10,9,8,9,11,12,5,6};
        selectionSort(a);
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+",");
        }
    }

}
