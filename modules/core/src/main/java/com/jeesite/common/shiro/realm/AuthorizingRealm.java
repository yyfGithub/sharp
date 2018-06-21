/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.common.shiro.realm;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.subject.PrincipalCollection;

import com.jeesite.common.codec.EncodeUtils;
import com.jeesite.common.lang.ObjectUtils;
import com.jeesite.common.utils.SpringUtils;
import com.jeesite.common.web.http.ServletUtils;
import com.jeesite.modules.sys.entity.EmpUser;
import com.jeesite.modules.sys.entity.Log;
import com.jeesite.modules.sys.entity.User;
import com.jeesite.modules.sys.service.EmpUserService;
import com.jeesite.modules.sys.service.UserService;
import com.jeesite.modules.sys.utils.LogUtils;
import com.jeesite.modules.sys.utils.UserUtils;

/**
 * 系统安全认证实现类
 * @author ThinkGem
 * @version 2017-03-22
 */
public class AuthorizingRealm extends com.jeesite.common.shiro.realm.BaseAuthorizingRealm  {

	private UserService userService;
	private EmpUserService empUserService;
	
	public AuthorizingRealm() {
		super();
	}

	@Override
	protected void casCreateEmpUser(User user, Map<String, Object> attributes) {
		EmpUser empUser = new EmpUser();
		empUser.setIsNewRecord(true);
		empUser.setMobile(user.getMobile());
		empUser.setEmail(user.getEmail());
		empUser.setPhone(user.getPhone());
		empUser.getEmployee().getCompany().setCompanyCode(EncodeUtils
				.decodeUrl(ObjectUtils.toString(attributes.get("companyCode"))));
		empUser.getEmployee().getOffice().setOfficeCode(EncodeUtils
				.decodeUrl(ObjectUtils.toString(attributes.get("officeCode"))));
		getEmpUserService().save(empUser);
	}
	
	@Override
	public void onLoginSuccess(PrincipalCollection principals) {
		super.onLoginSuccess(principals);
		
		User user = UserUtils.getUser();
		
		// 更新登录IP、时间、会话ID等
		getUserService().updateUserLoginInfo(user);
		
		// 记录用户登录日志
		LogUtils.saveLog(user, ServletUtils.getRequest(), "系统登录", Log.TYPE_LOGIN_LOGOUT);
	}
	
	@Override
	public void onLogoutSuccess(User logoutUser, HttpServletRequest request) {
		// 记录用户退出日志
		LogUtils.saveLog(logoutUser, request, "系统退出", Log.TYPE_LOGIN_LOGOUT);
	}

	public UserService getUserService() {
		if (userService == null){
			userService = SpringUtils.getBean(UserService.class);
		}
		return userService;
	}

	public EmpUserService getEmpUserService() {
		if (empUserService == null){
			empUserService = SpringUtils.getBean(EmpUserService.class);
		}
		return empUserService;
	}
	
}
