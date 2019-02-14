package com.service;

import java.math.BigDecimal;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Departmenta;

public interface DepartmentaService {

	/**
	 * ��ѯ���еĲ�����Ϣ
	 * @return
	 */
	public List<Departmenta> findAllDepart(Integer pageNo,Integer pageSize);
	
	
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
	public int del(@Param("id")Integer id);
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
	public int update(Integer id,
								String departmentalName,
								Integer personsNum,
								double wageCoefficient);
	
	/**
	 * ��Ӳ�����Ϣ
	 * @param departmentalName
	 * @param personsNum
	 * @param WageCoefficient
	 * @return
	 */
	public int add(String departmentalName,Integer personsNum,double wageCoefficient);
	
	
	/**
	 * ��ѯ���еĲ���
	 * @return
	 */
	public List<Departmenta> getAllDepart1();
	
	
}
