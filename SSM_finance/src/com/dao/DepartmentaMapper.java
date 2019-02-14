package com.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Departmenta;

/**
 * 部门信息mapper
 * @author DELL
 *
 */
public interface DepartmentaMapper {
	
	/**
	 * 查询所有的部门信息
	 * @return
	 */
	public List<Departmenta> getAllDepart(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * 查询所有的部门
	 * @return
	 */
	public List<Departmenta> getAllDepart1();
	
	
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
	public int delDepartmenta(@Param("id")Integer id);
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
	public int updateDepartmenta(@Param("id")Integer id,
								@Param("departmentalName")String departmentalName,
								@Param("personsNum")Integer personsNum,
								@Param("wageCoefficient")double wageCoefficient);
	
	/**
	 * 添加部门信息
	 * @param departmentalName
	 * @param personsNum
	 * @param WageCoefficient
	 * @return
	 */
	public int addDepartmenta(@Param("departmentalName")String departmentalName,
							@Param("personsNum")Integer personsNum,
							@Param("wageCoefficient")double wageCoefficient);
	
	
	

}