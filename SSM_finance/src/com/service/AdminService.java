package com.service;

import com.pojo.Admin;

/**
 * 管理员
 * @author DELL
 *
 */
public interface AdminService {
	
	/**
	 * 登陆查询
	 * @param admin
	 * @return
	 */
	public Admin findAdmin(String adminName,String adminPwd);

}
