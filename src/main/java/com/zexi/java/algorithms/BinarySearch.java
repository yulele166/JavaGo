/**
 * 二分查找
 */
package com.zexi.java.algorithms;

/**
 * @author yulele
 *
 * @time 2017年5月9日 下午3:48:29
 */
public class BinarySearch {

    public static int rank(int key, int[] a){
        //数组必须是有序的
        int head = 0;
        int tail = a.length - 1;
        while(head <= tail){
            //被查找的键要么不存在，要么必然存在于a[head..tail]之中
            int mid = head + (tail - head)/2;
            if(key < a[mid]){
                tail = mid - 1;
            }else if(key > a[mid]){
                head = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] a,int head,int tail,int key){
        //数组必须是有序的
//        int head = 0;
//        int tail = a.length - 1;
        if(head <= tail){
            //被查找的键要么不存在，要么必然存在于a[head..tail]之中
            int mid = head + (tail - head)/2;
            if(key < a[mid]){
                tail = mid - 1;
            }else if(key > a[mid]){
                head = mid + 1;
            }else{//key == a[mid]
                return mid;
            }
            return binarySearch(a,head,tail,key);
        }
        return -1;
    }
    /**
     * 数组去重
     */
    private static int[] duplicateRemoval(int[] a) {
        int num = count(a);
        int[] b = new int[a.length-num];
        int count = 0;
        b[0] = a[0];
        for(int i = 0;i < a.length-1;i++){
            if(a[i]==a[i+1]){
                count ++;
            }else{
                b[i+1-count] = a[i+1];
            }
        }
        return b;

    }
    /**
     * 计算重复数量 
     */
    private static int count(int[] a) {
        int count = 0;
        for(int i = 0;i < a.length-1;i++){
            if(a[i]==a[i+1]){
                count ++;
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        int[] a = {10,20,30,30,30,40,40,40,40,50,60};
//        int i = rank(40,a);
//        System.out.println(i);
//        if(i>-1){
//            System.out.println(a[i]);
//        }
        System.out.println(binarySearch(a,0,a.length-1,40));
        int[] b = duplicateRemoval(a);
        System.out.println(b);
    }
}
