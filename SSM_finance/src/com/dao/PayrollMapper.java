package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Payroll;

/**
 * 工资信息
 * @author DELL
 *
 */
public interface PayrollMapper {
	
	/**
	 * 查询工资总条数
	 * @return
	 */
	public int countPary();
	
	/**
	 * 查询所有员工的工资信息()
	 * @return
	 */
	public List<Payroll> selectAll(@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * 根据ID进行添加
	 * @param id
	 * @return
	 */
	public int insertPayById(Payroll pay);
	
	/**
	 * 对工资进行修改
	 * @param id
	 * @return
	 */
	public int updatePay(@Param("id")String id);
	
	/**
	 * 根据ID删除工资信息
	 * @param id
	 * @return
	 */
	public int delPay(@Param("id")Integer id);
}