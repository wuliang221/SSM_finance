package com.service;

import java.math.BigDecimal;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Businessinformation;

public interface BusinessinformationService {
	
	/**
	 * ��ѯ��Ӫ��������
	 * @return
	 */
	public int Count();
	
	/**
	 * ��ѯ���о�Ӫ��Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Businessinformation> findBusiness(Integer pageNo,Integer pageSize);

	
	/**
	 * ��Ӿ�Ӫ��Ϣ
	 * @param businessName
	 * @param investment
	 * @param revenue
	 * @return
	 */
	public int add(String businessName,BigDecimal investment,BigDecimal revenue);

	/**
	 * ����ID��ѯ��Ӫ��Ϣ
	 * @param id
	 * @return
	 */
	public Businessinformation businessinformation(Integer id);
	
	
	
	/**
	 * ����IDɾ����Ӫ��Ϣ
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	
	/**
	 * ����ID�޸ľ�Ӫ��Ϣ
	 * @param id
	 * @param businessName
	 * @param investment
	 * @param revenue
	 * @return
	 */
	public int update(Integer id,String businessName,BigDecimal investment,BigDecimal revenue);



}
