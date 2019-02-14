package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.Admin;
/**
 * 管理员Mapper
 * @author DELL
 *
 */
public interface AdminMapper {

	/**
	 * 登陆查询
	 * @param admin
	 * @return
	 */
	public Admin getAdmin(@Param("adminName")String adminName,@Param("adminPwd")String adminPwd);

}