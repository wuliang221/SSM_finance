package com.service;

import java.math.BigDecimal;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Departmenta;

public interface DepartmentaService {

	/**
	 * 查询所有的部门信息
	 * @return
	 */
	public List<Departmenta> findAllDepart(Integer pageNo,Integer pageSize);
	
	
	/**
	 * 查询部门总数
	 * @return
	 */
	public int countDepart();
	
	/**
	 * 根据ID删除部门信息
	 * @param id
	 * @return
	 */
	public int del(@Param("id")Integer id);
	/**
	 * 根据ID查询部门信息
	 * @param id
	 * @return
	 */
	public Departmenta departmenta(@Param("id")Integer id);
	
	/**
	 * 根据ID修改部门信息
	 * @param id
	 * @param departmentalName
	 * @param personsNum
	 * @param WageCoefficient
	 * @return
	 */
	public int update(Integer id,
								String departmentalName,
								Integer personsNum,
								double wageCoefficient);
	
	/**
	 * 添加部门信息
	 * @param departmentalName
	 * @param personsNum
	 * @param WageCoefficient
	 * @return
	 */
	public int add(String departmentalName,Integer personsNum,double wageCoefficient);
	
	
	/**
	 * 查询所有的部门
	 * @return
	 */
	public List<Departmenta> getAllDepart1();
	
	
}
