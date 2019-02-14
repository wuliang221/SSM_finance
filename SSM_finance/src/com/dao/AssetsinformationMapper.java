package com.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Assetsinformation;

/**
 * �ʲ���Ϣmapper
 * @author DELL
 *
 */
public interface AssetsinformationMapper {
	
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
	public List<Assetsinformation> selectAll(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ����ʲ���Ϣ
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int addAssetsinformation(@Param("assetNo")Integer assetNo,@Param("assetsName")String assetsName);

	/**
	 * ����IDɾ���ʲ���Ϣ
	 * @param id
	 * @return
	 */
	public int delAssetsinformation(@Param("id")Integer id);
	
	/**
	 * ����ID��ѯ�����ʲ�
	 * @param id
	 * @return
	 */
	public Assetsinformation assetsinformation(@Param("id")Integer id);
	
	/**
	 * ����ID�޸��ʲ���Ϣ
	 * @param assetNo
	 * @param assetsName
	 * @return
	 */
	public int updateAssetsinformation(@Param("id")Integer id,@Param("assetNo")Integer assetNo,@Param("assetsName")String assetsName,
										@Param("modifyDate")Date modifyDate );

}