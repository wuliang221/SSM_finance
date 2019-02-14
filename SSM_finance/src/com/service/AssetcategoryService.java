package com.service;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Assetcategory;

public interface AssetcategoryService {

	
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
	public List<Assetcategory> selectAll(Integer pagNo,Integer pageSize);
	
	/**
	 * ����ʲ����
	 * @param name
	 * @return
	 */
	public int add(String name);
	/**
	 * ����ID�����ʲ����
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
