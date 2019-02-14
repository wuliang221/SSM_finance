package com.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BusinessinformationMapper;
import com.pojo.Businessinformation;
import com.service.BusinessinformationService;

@Service
public class BusinessinformationServiceImpl implements
		BusinessinformationService {

	@Resource
	private BusinessinformationMapper businessinformationMapper;
	
	@Override
	public int Count() {
		return businessinformationMapper.BusinessCount();
	}

	@Override
	public List<Businessinformation> findBusiness(Integer pageNo,
			Integer pageSize) {
		return businessinformationMapper.selectBusiness(pageNo, pageSize);
	}

	@Override
	public int add(String businessName,
			BigDecimal investment, BigDecimal revenue) {
		// TODO Auto-generated method stub
		return businessinformationMapper.addBusinessinformation(businessName, investment, revenue);
	}

	@Override
	public Businessinformation businessinformation(Integer id) {
		// TODO Auto-generated method stub
		return businessinformationMapper.businessinformation(id);
	}

	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return businessinformationMapper.delBusinessinformation(id);
	}

	@Override
	public int update(Integer id, String businessName,
			BigDecimal investment, BigDecimal revenue) {
		// TODO Auto-generated method stub
		return businessinformationMapper.updateBusinessinformation(id, businessName, investment, revenue);
	}

}
