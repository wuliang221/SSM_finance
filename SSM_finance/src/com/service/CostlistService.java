package com.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Costlist;

public interface CostlistService {
	
	
	/**
	 * 查询经费总条数
	 * @return
	 */
	public int Count();
	
	/**
	 * 查询经费所有信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Costlist> getAll(Integer pageNo,Integer pageSize);
	
	
	

	/**
	 * 根据ID查询单个经费信息
	 * @param id
	 * @return
	 */
	public Costlist costlist(@Param("id")Integer id);
	/**
	 * 根据ID修改经费信息
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
	 * 根据ID删除经费信息
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	/**
	 * 添加经费信息
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int add(String costName,Date costdate,BigDecimal money,String type);
	

}
