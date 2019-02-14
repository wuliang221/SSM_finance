package com.service;

import java.util.Date;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Assetsinformation;

public interface AssetsinformationService {
	

	/**
	 * 查询所有资产信息的数量
	 * @return
	 */
	public int countAll();
	
	/**
	 * 查询所有的资产信息
	 * @param pagNo
	 * @param pageSize
	 * @return
	 */
	public List<Assetsinformation> findAll(Integer pageNo,Integer pageSize);



	/**
	 * 添加资产信息
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int add(Integer assetNo,String assetsName);

	/**
	 * 根据ID删除资产信息
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	
	/**
	 * 根据ID查询单个资产
	 * @param id
	 * @return
	 */
	public Assetsinformation assetsinformation(Integer id);
	
	/**
	 * 根据ID修改资产信息
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int change(Integer id,Integer assetNo,String assetsName,Date modifyDate );

	
}
