package com.service;

import java.util.Date;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Assetsinformation;

public interface AssetsinformationService {
	

	/**
	 * ��ѯ�����ʲ���Ϣ������
	 * @return
	 */
	public int countAll();
	
	/**
	 * ��ѯ���е��ʲ���Ϣ
	 * @param pagNo
	 * @param pageSize
	 * @return
	 */
	public List<Assetsinformation> findAll(Integer pageNo,Integer pageSize);



	/**
	 * ����ʲ���Ϣ
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int add(Integer assetNo,String assetsName);

	/**
	 * ����IDɾ���ʲ���Ϣ
	 * @param id
	 * @return
	 */
	public int del(Integer id);
	
	/**
	 * ����ID��ѯ�����ʲ�
	 * @param id
	 * @return
	 */
	public Assetsinformation assetsinformation(Integer id);
	
	/**
	 * ����ID�޸��ʲ���Ϣ
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int change(Integer id,Integer assetNo,String assetsName,Date modifyDate );

	
}
