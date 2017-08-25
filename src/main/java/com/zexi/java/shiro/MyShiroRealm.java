/**
 * 
 */
package com.zexi.java.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.zexi.java.utils.DecriptUtil;

/**
 * @author yulele
 *
 */
public class MyShiroRealm extends AuthenticatingRealm{

	//这里因为没有调用后台，直接默认只有一个用户("zexi"，"123456")
    private static final String USER_NAME = "zexi";  
    private static final String PASSWORD = "123456";
	
    /*
     * 授权
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) { 
        Set<String> roleNames = new HashSet<String>();  
        Set<String> permissions = new HashSet<String>();  
        roleNames.add("administrator");//添加角色
        permissions.add("newPage.jhtml");  //添加权限
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);  
        info.setStringPermissions(permissions);  
        return info;  
    }
    /*
     * 登录验证
     */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		if(token.getUsername().equals(USER_NAME)){
			return new SimpleAuthenticationInfo(USER_NAME,DecriptUtil.MD5(PASSWORD),getName());
		}else{
			throw new AuthenticationException();
		}
	}

}
