package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Payroll;
/**
 * ������Ϣservices
 * @author DELL
 *
 */
public interface PayrollService {
	
	
	/**
	 * ��ѯ����������
	 * @return
	 */
	public int countPary();
	
	
	/**
	 * ��ѯ����Ա���Ĺ�����Ϣ()
	 * @return
	 */
	public List<Payroll> findAll(Integer pagNo,Integer pageSize);
	
	/**
	 * ����ID�������
	 * @param id
	 * @return
	 */
	public boolean insertPayById(Payroll pay);
	
	/**
	 * �Թ��ʽ����޸�
	 * @param id
	 * @return
	 */
	public boolean updatePay(@Param("id")String id);

}
