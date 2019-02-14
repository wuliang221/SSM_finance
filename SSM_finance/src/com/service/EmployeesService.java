package com.service;

import java.util.List;


import com.pojo.Employees;
/**
 * 普通员工Service层
 * @author DELL
 *
 */
public interface EmployeesService {
	
	/**
	 * 查询普通员工的数量（或者模糊查询普通员工的数量）
	 * @param name
	 * @return
	 */
	public int countEmployees(String name);
	
	/**
	 * 普通员工登陆方法
	 * @param employess
	 * @return
	 */
	public Employees findEmployees(String loginName,String password);
	
	/**
	 * 查询所有员工的信息(或者根据姓名模糊查询)
	 * @return
	 */
	public List<Employees> findEmployeesAll(String name,Integer pagNo,Integer pageSize);
	
	
	/**
	 * 根据ID查询员工的信息
	 * @return
	 */
	public Employees findEmployeesByid(String id);
	
	
	/**
	 * 普通用户根据自己的id修改密码
	 * @param password
	 * @param id
	 * @return
	 */
	public boolean updatePasswordById(String password,String id);
	
	/**
	 * 管理员添加用户
	 * @param employees
	 * @return
	 */
	public boolean adminInsertEmployees(Employees employees);
	
	/**
	 * 管理员根据id删除员工信息
	 * @param id
	 * @return
	 */
	public boolean adminDelectEmployees(String id);
	
	/**
	 * 管理员根据ID修改普通员工
	 * @param employees
	 * @return
	 */
	public boolean adminUpdateEmployeesById(Employees employees);
	

}
