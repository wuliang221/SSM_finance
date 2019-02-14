package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Payroll;

/**
 * ������Ϣ
 * @author DELL
 *
 */
public interface PayrollMapper {
	
	/**
	 * ��ѯ����������
	 * @return
	 */
	public int countPary();
	
	/**
	 * ��ѯ����Ա���Ĺ�����Ϣ()
	 * @return
	 */
	public List<Payroll> selectAll(@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ����ID�������
	 * @param id
	 * @return
	 */
	public int insertPayById(Payroll pay);
	
	/**
	 * �Թ��ʽ����޸�
	 * @param id
	 * @return
	 */
	public int updatePay(@Param("id")String id);
	
	/**
	 * ����IDɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public int delPay(@Param("id")Integer id);
}