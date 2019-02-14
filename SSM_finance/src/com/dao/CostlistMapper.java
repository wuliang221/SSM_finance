package com.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Costlist;

/**
 * ������Ϣmapper
 * @author DELL
 *
 */
public interface CostlistMapper {
	/**
	 * ��ѯ����������
	 * @return
	 */
	public int costlistCount();
	
	/**
	 * ��ѯ����������Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Costlist> selectAll(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	/**
	 * ����ID��ѯ����������Ϣ
	 * @param id
	 * @return
	 */
	public Costlist costlist(@Param("id")Integer id);
	/**
	 * ����ID�޸ľ�����Ϣ
	 * @param id
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int updateCostlist(@Param("id")Integer id,@Param("costName")String costName,@Param("costdate")Date costdate,
								@Param("money")BigDecimal money,@Param("type")String type);
	/**
	 * ����IDɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public int delCostlist(@Param("id")Integer id);
	/**
	 * ��Ӿ�����Ϣ
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int addCostlist(@Param("costName")String costName,@Param("costdate")Date costdate,
			@Param("money")BigDecimal money,@Param("type")String type);
	
	

}