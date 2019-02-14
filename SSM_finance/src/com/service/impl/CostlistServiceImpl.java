package com.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CostlistMapper;
import com.pojo.Costlist;
import com.service.CostlistService;

@Service
public class CostlistServiceImpl implements CostlistService {

	@Resource
	private CostlistMapper costlistMapper;
	
	@Override
	public int Count() {
		return costlistMapper.costlistCount();
	}

	@Override
	public List<Costlist> getAll(Integer pageNo, Integer pageSize) {
		return costlistMapper.selectAll(pageNo, pageSize);
	}

	@Override
	public Costlist costlist(Integer id) {
		// TODO Auto-generated method stub
		return costlistMapper.costlist(id);
	}

	@Override
	public int update(Integer id, String costName, Date costdate,
			BigDecimal money, String type) {
		// TODO Auto-generated method stub
		return costlistMapper.updateCostlist(id, costName, costdate, money, type);
	}

	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return costlistMapper.delCostlist(id);
	}

	@Override
	public int add(String costName, Date costdate, BigDecimal money, String type) {
		// TODO Auto-generated method stub
		return costlistMapper.addCostlist(costName, costdate, money, type);
	}

}
