package com.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Assetsinformation;

/**
 * 资产信息mapper
 * @author DELL
 *
 */
public interface AssetsinformationMapper {
	
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
	public List<Assetsinformation> selectAll(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * 添加资产信息
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int addAssetsinformation(@Param("assetNo")Integer assetNo,@Param("assetsName")String assetsName);

	/**
	 * 根据ID删除资产信息
	 * @param id
	 * @return
	 */
	public int delAssetsinformation(@Param("id")Integer id);
	
	/**
	 * 根据ID查询单个资产
	 * @param id
	 * @return
	 */
	public Assetsinformation assetsinformation(@Param("id")Integer id);
	
	/**
	 * 根据ID修改资产信息
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int updateAssetsinformation(@Param("id")Integer id,@Param("assetNo")Integer assetNo,@Param("assetsName")String assetsName,
										@Param("modifyDate")Date modifyDate );

}