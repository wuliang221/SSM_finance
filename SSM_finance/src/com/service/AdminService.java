package com.service;

import com.pojo.Admin;

/**
 * ����Ա
 * @author DELL
 *
 */
public interface AdminService {
	
	/**
	 * ��½��ѯ
	 * @param admin
	 * @return
	 */
	public Admin findAdmin(String adminName,String adminPwd);

}
