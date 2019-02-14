package com.service;

import java.util.List;


import com.pojo.Employees;
/**
 * ��ͨԱ��Service��
 * @author DELL
 *
 */
public interface EmployeesService {
	
	/**
	 * ��ѯ��ͨԱ��������������ģ����ѯ��ͨԱ����������
	 * @param name
	 * @return
	 */
	public int countEmployees(String name);
	
	/**
	 * ��ͨԱ����½����
	 * @param employess
	 * @return
	 */
	public Employees findEmployees(String loginName,String password);
	
	/**
	 * ��ѯ����Ա������Ϣ(���߸�������ģ����ѯ)
	 * @return
	 */
	public List<Employees> findEmployeesAll(String name,Integer pagNo,Integer pageSize);
	
	
	/**
	 * ����ID��ѯԱ������Ϣ
	 * @return
	 */
	public Employees findEmployeesByid(String id);
	
	
	/**
	 * ��ͨ�û������Լ���id�޸�����
	 * @param password
	 * @param id
	 * @return
	 */
	public boolean updatePasswordById(String password,String id);
	
	/**
	 * ����Ա����û�
	 * @param employees
	 * @return
	 */
	public boolean adminInsertEmployees(Employees employees);
	
	/**
	 * ����Ա����idɾ��Ա����Ϣ
	 * @param id
	 * @return
	 */
	public boolean adminDelectEmployees(String id);
	
	/**
	 * ����Ա����ID�޸���ͨԱ��
	 * @param employees
	 * @return
	 */
	public boolean adminUpdateEmployeesById(Employees employees);
	

}
