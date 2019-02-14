package com.service;

import java.math.BigDecimal;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Businessinformation;

public interface BusinessinformationService {
	
	/**
	 * 查询经营所有数量
	 * @return
	 */
	public int Count();
	
	/**
	 * 查询所有经营信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Businessinformation> findBusiness(Integer pageNo,Integer pageSize);

	
	/**
	 * 添加经营信息
	 * @param businessName
	 * @param investment
	 * @param revenue
	 * @return
	 */
	public int add(String businessName,BigDecimal investment,BigDecimal revenue);

	/**
	 * 根据ID查询经营信息
	 * @param id
	 * @return
	 */
	public Businessinformation businessinformation(Integer id);
	
	
	
	/**
	 * 根据ID删除经营信息
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	
	/**
	 * 根据ID修改经营信息
	 * @param id
	 * @param businessName
	 * @param investment
	 * @param revenue
	 * @return
	 */
	public int update(Integer id,String businessName,BigDecimal investment,BigDecimal revenue);



}
