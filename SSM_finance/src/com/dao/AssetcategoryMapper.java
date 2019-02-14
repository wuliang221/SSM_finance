package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Assetcategory;

/**
 * 资产类别Mapper
 * @author DELL
 *
 */
public interface AssetcategoryMapper {
	
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
	public List<Assetcategory> selectAll(@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * 根据id查询资产类别进行修改
	 * @param id
	 * @param name
	 * @return
	 */
	public Assetcategory assetcategory(@Param("id")Integer id);
	
	/**
	 * 添加资产类别
	 * @param name
	 * @return
	 */
	public int addAssetcategory(@Param("name")String name);
	/**
	 * 根据ID隐藏资产类别
	 * @param id
	 * @param del
	 * @return
	 */
	public int delAssetcategory(@Param("id")Integer id,@Param("del")Integer del);
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public int updateAssetcategory(@Param("id")Integer id,@Param("name")String name);
 
}