package com.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Businessinformation;


/**
 * 经营信息mapper
 * @author DELL
 *
 */
public interface BusinessinformationMapper {
		/**
		 * 查询经营所有数量
		 * @return
		 */
		public int BusinessCount();
		
		/**
		 * 查询所有经营信息
		 * @param pageNo
		 * @param pageSize
		 * @return
		 */
		public List<Businessinformation> selectBusiness(@Param("pageNo")Integer pageNo,
																@Param("pageSize")Integer pageSize);

		/**
		 * 添加经营信息
		 * @param businessName
		 * @param investment
		 * @param revenue
		 * @return
		 */
		public int addBusinessinformation(@Param("businessName")String businessName,
									@Param("investment")BigDecimal investment,@Param("revenue")BigDecimal revenue);
	
		/**
		 * 根据ID查询经营信息
		 * @param id
		 * @return
		 */
		public Businessinformation businessinformation(@Param("id")Integer id);
		
		
		
		/**
		 * 根据ID删除经营信息
		 * @param id
		 * @return
		 */
		public int delBusinessinformation(@Param("id")Integer id);
		
		/**
		 * 根据ID修改经营信息
		 * @param id
		 * @param businessName
		 * @param investment
		 * @param revenue
		 * @return
		 */
		public int updateBusinessinformation(@Param("id")Integer id,@Param("businessName")String businessName,
											@Param("investment")BigDecimal investment,@Param("revenue")BigDecimal revenue);
	
	
}