package com.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Costlist;

public interface CostlistService {
	
	
	/**
	 * ��ѯ����������
	 * @return
	 */
	public int Count();
	
	/**
	 * ��ѯ����������Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Costlist> getAll(Integer pageNo,Integer pageSize);
	
	
	

	/**
	 * ����ID��ѯ����������Ϣ
	 * @param id
	 * @return
	 */
	public Costlist costlist(@Param("id")Integer id);
	/**
	 * ����ID�޸ľ�����Ϣ
	 * @param id
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int update(Integer id,String costName,Date costdate,
								BigDecimal money,String type);
	/**
	 * ����IDɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	/**
	 * ��Ӿ�����Ϣ
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int add(String costName,Date costdate,BigDecimal money,String type);
	

}
