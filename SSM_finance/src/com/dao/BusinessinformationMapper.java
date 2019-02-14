package com.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Businessinformation;


/**
 * ��Ӫ��Ϣmapper
 * @author DELL
 *
 */
public interface BusinessinformationMapper {
		/**
		 * ��ѯ��Ӫ��������
		 * @return
		 */
		public int BusinessCount();
		
		/**
		 * ��ѯ���о�Ӫ��Ϣ
		 * @param pageNo
		 * @param pageSize
		 * @return
		 */
		public List<Businessinformation> selectBusiness(@Param("pageNo")Integer pageNo,
																@Param("pageSize")Integer pageSize);

		/**
		 * ��Ӿ�Ӫ��Ϣ
		 * @param businessName
		 * @param investment
		 * @param revenue
		 * @return
		 */
		public int addBusinessinformation(@Param("businessName")String businessName,
									@Param("investment")BigDecimal investment,@Param("revenue")BigDecimal revenue);
	
		/**
		 * ����ID��ѯ��Ӫ��Ϣ
		 * @param id
		 * @return
		 */
		public Businessinformation businessinformation(@Param("id")Integer id);
		
		
		
		/**
		 * ����IDɾ����Ӫ��Ϣ
		 * @param id
		 * @return
		 */
		public int delBusinessinformation(@Param("id")Integer id);
		
		/**
		 * ����ID�޸ľ�Ӫ��Ϣ
		 * @param id
		 * @param businessName
		 * @param investment
		 * @param revenue
		 * @return
		 */
		public int updateBusinessinformation(@Param("id")Integer id,@Param("businessName")String businessName,
											@Param("investment")BigDecimal investment,@Param("revenue")BigDecimal revenue);
	
	
}