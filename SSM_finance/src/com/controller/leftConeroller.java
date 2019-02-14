package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.pojo.Employees;
import com.service.EmployeesService;
import com.util.PageSupport;



@Controller
@RequestMapping("/left")
public class leftConeroller {
	
	@Resource
	private EmployeesService employeesService;

	//部门信息管理表格
	@RequestMapping(value="/bg1")
	@ResponseBody
	public void BG1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables1.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg2")
	@ResponseBody
	public void BG2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables2.jsp").forward(request, response);
		
		
	}
	
	@RequestMapping(value="/bg3")
	@ResponseBody
	public void BG3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables3.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg4")
	@ResponseBody
	public void BG4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables4.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg5")
	@ResponseBody
	public void BG5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables5.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg6")
	@ResponseBody
	public void BG6(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables6.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg7")
	@ResponseBody
	public void BG7(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables7.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/bg8")
	@ResponseBody
	public void BG8(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables8.jsp").forward(request, response);
	}
	@RequestMapping(value="/bg9")
	@ResponseBody
	public void BG9(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/Tables9.jsp").forward(request, response);
	}
	
	
}
