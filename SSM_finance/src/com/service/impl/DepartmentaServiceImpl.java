package com.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.DepartmentaMapper;
import com.pojo.Departmenta;
import com.service.DepartmentaService;
@Service
public class DepartmentaServiceImpl implements DepartmentaService {

	@Resource
	private DepartmentaMapper departmentaMapper;
	
	@Override
	public List<Departmenta> findAllDepart(Integer pageNo,Integer pageSize) {
		return departmentaMapper.getAllDepart(pageNo,pageSize);
	}
	@Override
	public int countDepart() {
		return departmentaMapper.countDepart();
	}
	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return departmentaMapper.delDepartmenta(id);
	}
	@Override
	public Departmenta departmenta(Integer id) {
		// TODO Auto-generated method stub
		return departmentaMapper.departmenta(id);
	}
	@Override
	public int update(Integer id, String departmentalName, Integer personsNum,
			double wageCoefficient) {
		// TODO Auto-generated method stub
		return departmentaMapper.updateDepartmenta(id, departmentalName, personsNum, wageCoefficient);
	}
	@Override
	public int add(String departmentalName, Integer personsNum,
			double wageCoefficient) {
		// TODO Auto-generated method stub
		return departmentaMapper.addDepartmenta(departmentalName, personsNum, wageCoefficient);
	}
	@Override
	public List<Departmenta> getAllDepart1() {
		// TODO Auto-generated method stub
		return departmentaMapper.getAllDepart1();
	}

}
