package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Employees;

/**
 * 普通员工Mapper
 * @author DELL
 *
 */
public interface EmployeesMapper {

	/**
	 * 查询普通员工的数量（或者模糊查询普通员工的数量）
	 * @param name
	 * @return
	 */
	public int countEmployees(@Param("name")String name);
	
	/**
	 * 普通员工登陆方法
	 * @param employess
	 * @return
	 */
	public Employees getEmployees(@Param("loginName")String loginName,@Param("password")String password);

	/**
	 * 查询所有员工的信息(或者根据姓名模糊查询)(分页查询)
	 * @return
	 */
	public List<Employees> getEmployeesAll(@Param("name")String name,
											@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * 根据ID查询员工的信息
	 * @return
	 */
	public Employees getEmployeesByid(@Param("id")String id);
	
	
	/**
	 * 普通用户根据自己的id修改密码
	 * @param password
	 * @param id
	 * @return
	 */
	public int updatePasswordById(@Param("password")String password,@Param("id")String id);
	/**
	 * 管理员添加用户
	 * @param employees
	 * @return
	 */
	public int adminInsertEmployees(Employees employees);
	
	/**
	 * 管理员根据id删除员工信息
	 * @param id
	 * @return
	 */
	public int adminDelectEmployees(@Param("id")String id);
	
	/**
	 * 管理员根据ID修改普通员工
	 * @param employees
	 * @return
	 */
	public int adminUpdateEmployeesById(Employees employees);


}