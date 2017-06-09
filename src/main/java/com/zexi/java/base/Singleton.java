/**
 * 单例
 */
package com.zexi.java.base;

/**
 * @author yulele
 *
 * @time 2017年3月20日 上午10:22:20
 */
public class Singleton {

	/**
	 * 饿汉式
	 */
	private Singleton() {}

	public static final Singleton instance = new Singleton();
	
	public static void main(String[] args) {
		System.out.println(Singleton.instance.hashCode());
		System.out.println(Singleton.instance.hashCode());
		System.out.println(Singleton.instance.equals(Singleton.instance));
	}
}

class Singleton2 {
    
    /**
     * 懒汉式
     */
    private static final Singleton2 instance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return instance;
    }
}
