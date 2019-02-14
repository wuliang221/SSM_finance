package com.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Costlist;

/**
 * 费用信息mapper
 * @author DELL
 *
 */
public interface CostlistMapper {
	/**
	 * 查询经费总条数
	 * @return
	 */
	public int costlistCount();
	
	/**
	 * 查询经费所有信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Costlist> selectAll(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
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
	public int updateCostlist(@Param("id")Integer id,@Param("costName")String costName,@Param("costdate")Date costdate,
								@Param("money")BigDecimal money,@Param("type")String type);
	/**
	 * 根据ID删除经费信息
	 * @param id
	 * @return
	 */
	public int delCostlist(@Param("id")Integer id);
	/**
	 * 添加经费信息
	 * @param costName
	 * @param costdate
	 * @param money
	 * @param type
	 * @return
	 */
	public int addCostlist(@Param("costName")String costName,@Param("costdate")Date costdate,
			@Param("money")BigDecimal money,@Param("type")String type);
	
	

}