package com.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Departmenta;

/**
 * ������Ϣmapper
 * @author DELL
 *
 */
public interface DepartmentaMapper {
	
	/**
	 * ��ѯ���еĲ�����Ϣ
	 * @return
	 */
	public List<Departmenta> getAllDepart(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ��ѯ���еĲ���
	 * @return
	 */
	public List<Departmenta> getAllDepart1();
	
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public int countDepart();
	/**
	 * ����IDɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public int delDepartmenta(@Param("id")Integer id);
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Departmenta departmenta(@Param("id")Integer id);
	
	/**
	 * ����ID�޸Ĳ�����Ϣ
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
	 * ��Ӳ�����Ϣ
	 * @param departmentalName
	 * @param personsNum
	 * @param WageCoefficient
	 * @return
	 */
	public int addDepartmenta(@Param("departmentalName")String departmentalName,
							@Param("personsNum")Integer personsNum,
							@Param("wageCoefficient")double wageCoefficient);
	
	
	

}