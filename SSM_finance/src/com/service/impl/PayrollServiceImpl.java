package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PayrollMapper;
import com.pojo.Payroll;
import com.service.PayrollService;
@Service
public class PayrollServiceImpl implements PayrollService {
	@Resource
	private PayrollMapper payrollMapper;
	@Override
	public boolean insertPayById(Payroll pay) {
		int result=payrollMapper.insertPayById(pay);
		boolean rs=false;
		if(result>0){
			rs=true;
		}
		return rs;
	}

	@Override
	public boolean updatePay(String id) {
		int result=payrollMapper.updatePay(id);
		boolean rs=false;
		if(result>0){
			rs=true;
		}
		return rs;
		
	}

	@Override
	public List<Payroll> findAll(Integer pagNo,Integer pageSize) {
		return payrollMapper.selectAll(pagNo,pageSize);
	}

	@Override
	public int countPary() {
		return payrollMapper.countPary();
	}

}
