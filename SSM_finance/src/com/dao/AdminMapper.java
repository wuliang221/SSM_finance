package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.Admin;
/**
 * ����ԱMapper
 * @author DELL
 *
 */
public interface AdminMapper {

	/**
	 * ��½��ѯ
	 * @param admin
	 * @return
	 */
	public Admin getAdmin(@Param("adminName")String adminName,@Param("adminPwd")String adminPwd);

}