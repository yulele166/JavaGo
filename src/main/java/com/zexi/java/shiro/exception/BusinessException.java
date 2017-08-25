/**
 * 
 */
package com.zexi.java.shiro.exception;
/**
 * @author yulele
 *
 */
public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BusinessException(Object Obj) {
		super(Obj.toString());
	}
}
