package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Assetcategory;

/**
 * �ʲ����Mapper
 * @author DELL
 *
 */
public interface AssetcategoryMapper {
	
	/**
	 * ��ѯ�ʲ���������
	 * @return
	 */
	public int assetCount();
	/**
	 * ��ѯ�ʲ����
	 * @param pagNo
	 * @param pageSize
	 * @return
	 */
	public List<Assetcategory> selectAll(@Param("pagNo")Integer pagNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ����id��ѯ�ʲ��������޸�
	 * @param id
	 * @param name
	 * @return
	 */
	public Assetcategory assetcategory(@Param("id")Integer id);
	
	/**
	 * ����ʲ����
	 * @param name
	 * @return
	 */
	public int addAssetcategory(@Param("name")String name);
	/**
	 * ����ID�����ʲ����
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