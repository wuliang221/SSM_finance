package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.AdminMapper;
import com.pojo.Admin;
import com.service.AdminService;

/**
 * ����ԱServiceImpl
 * @author DELL
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminMapper adminMapper;
	
	/**
	 * ����Ա��½����
	 */
	@Override
	public Admin findAdmin(String adminName,String adminPwd){
		
		return adminMapper.getAdmin(adminName,adminPwd);
	}

}
