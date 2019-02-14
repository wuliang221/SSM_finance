package com.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.EmployeesService;
import com.service.PayrollService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private Logger log = Logger.getLogger(AdminController.class);
	
	@Resource
	private EmployeesService employeesService;
	@Resource
	private PayrollService payrollService;
	
	public String addEmployess(){
		return null;
		
	}
	@RequestMapping("/change.html")
	public String changePwd(){
		return "Table/Tables9";
	}
	
	
}
