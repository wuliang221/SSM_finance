package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Employees;

/**
 * ��ͨԱ��Mapper
 * @author DELL
 *
 */
public interface EmployeesMapper {

	/**
	 * ��ѯ��ͨԱ��������������ģ����ѯ��ͨԱ����������
	 * @param name
	 * @return
	 */
	public int countEmployees(@Param("name")String name);
	
	/**
	 * ��ͨԱ����½����
	 * @param employess
	 * @return
	 */
	public Employees getEmployees(@Param("loginName")String loginName,@Param("password")String password);

	/**
	 * ��ѯ����Ա������Ϣ(���߸�������ģ����ѯ)(��ҳ��ѯ)
	 * @return
	 */
	public List<Employees> getEmployeesAll(@Param("name")String name,
											@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ����ID��ѯԱ������Ϣ
	 * @return
	 */
	public Employees getEmployeesByid(@Param("id")String id);
	
	
	/**
	 * ��ͨ�û������Լ���id�޸�����
	 * @param password
	 * @param id
	 * @return
	 */
	public int updatePasswordById(@Param("password")String password,@Param("id")String id);
	/**
	 * ����Ա����û�
	 * @param employees
	 * @return
	 */
	public int adminInsertEmployees(Employees employees);
	
	/**
	 * ����Ա����idɾ��Ա����Ϣ
	 * @param id
	 * @return
	 */
	public int adminDelectEmployees(@Param("id")String id);
	
	/**
	 * ����Ա����ID�޸���ͨԱ��
	 * @param employees
	 * @return
	 */
	public int adminUpdateEmployeesById(Employees employees);


}