package com.service;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Assetcategory;

public interface AssetcategoryService {

	
	/**
	 * 查询资产类别的总数
	 * @return
	 */
	public int assetCount();
	/**
	 * 查询资产类别
	 * @param pagNo
	 * @param pageSize
	 * @return
	 */
	public List<Assetcategory> selectAll(Integer pagNo,Integer pageSize);
	
	/**
	 * 添加资产类别
	 * @param name
	 * @return
	 */
	public int add(String name);
	/**
	 * 根据ID隐藏资产类别
	 * @param id
	 * @param del
	 * @return
	 */
	public int del(Integer id,Integer del);
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public int updateById(Integer id,String name);
	
}
