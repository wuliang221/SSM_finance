package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Payroll;
/**
 * 工资信息services
 * @author DELL
 *
 */
public interface PayrollService {
	
	
	/**
	 * 查询工资总条数
	 * @return
	 */
	public int countPary();
	
	
	/**
	 * 查询所有员工的工资信息()
	 * @return
	 */
	public List<Payroll> findAll(Integer pagNo,Integer pageSize);
	
	/**
	 * 根据ID进行添加
	 * @param id
	 * @return
	 */
	public boolean insertPayById(Payroll pay);
	
	/**
	 * 对工资进行修改
	 * @param id
	 * @return
	 */
	public boolean updatePay(@Param("id")String id);

}
