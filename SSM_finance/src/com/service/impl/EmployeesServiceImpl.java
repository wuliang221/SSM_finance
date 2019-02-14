package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.EmployeesMapper;
import com.pojo.Employees;
import com.service.EmployeesService;
/**
 * π‹¿Ì‘±ServiceImpl
 * @author DELL
 *
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Resource
	private EmployeesMapper employeesMapper;
	
	@Override
	public Employees findEmployees(String loginName,String password) {
		return employeesMapper.getEmployees(loginName,password);
	}

	@Override
	public int countEmployees(String name) {
		return employeesMapper.countEmployees(name);
	}

	@Override
	public List<Employees> findEmployeesAll(String name,Integer pagNo,Integer pageSize) {
		return employeesMapper.getEmployeesAll(name, pagNo, pageSize);
	}

	@Override
	public boolean updatePasswordById(String password, String id) {
		boolean rs=false;
		int result=employeesMapper.updatePasswordById(password, id);
		if(result>0){
			rs=true;
		}
		return rs;
	}

	@Override
	public Employees findEmployeesByid(String id) {
		return employeesMapper.getEmployeesByid(id);
	}

	@Override
	public boolean adminUpdateEmployeesById(Employees employees) {
		boolean rs=false;
		int result=employeesMapper.adminUpdateEmployeesById(employees);
		if(result>0){
			rs=true;
		}
		return rs;
	}

	@Override
	public boolean adminInsertEmployees(Employees employees) {
		boolean rs=false;
		int result=employeesMapper.adminInsertEmployees(employees);
		if(result>0){
			rs=true;
		}
		return rs;
	}

	@Override
	public boolean adminDelectEmployees(String id) {
		boolean rs=false;
		int result=employeesMapper.adminDelectEmployees(id);
		if(result>0){
			rs=true;
		}
		return rs;
	}

}
