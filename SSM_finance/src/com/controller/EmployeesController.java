package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





import com.pojo.Employees;
import com.service.EmployeesService;
import com.util.PageSupport;

@Controller
@RequestMapping("/employess")
public class EmployeesController {
	
	private Logger log = Logger.getLogger(EmployeesController.class);
	
	@Resource
	private EmployeesService employeesService;
	/**
	 * 查询员工信息分页查询（跳转页面未知）
	 * @param model
	 * @param pageNo
	 * @param name
	 * @return
	 */
	@RequestMapping("/empList.html")
	public String employeesSelect(Model model,@RequestParam(value="pageNo",required=false)String pageNo,
													@RequestParam(value="name",required=false)String name){
		
		int result=employeesService.countEmployees(name);
		if(pageNo==null||pageNo==""){
			pageNo="1";
		}
		int currPageNo=Integer.parseInt(pageNo);
		if(currPageNo<1){
			currPageNo=1;
		}
		System.out.println(currPageNo);
		PageSupport ps=new PageSupport();
		ps.setPageSize(5);
		ps.setTotalCount(result);
		if(currPageNo>ps.getTotalPageCount()){
			currPageNo=ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index=(ps.getCurrPageNo()-1)*ps.getPageSize();
		if(index<0){
			index=1;
		}
		log.info("=========================="+(ps.getCurrPageNo()-1)*ps.getPageSize());
		
		List<Employees> empList=employeesService.findEmployeesAll(name, index, ps.getPageSize());
		System.out.println(empList);
		model.addAttribute("empList", empList);
		model.addAttribute("ps", ps);
		model.addAttribute("name", name);
		return "Table/Tables2";
		
		
	}
	
	//查询个人信息
	@RequestMapping("/employeesone.html")
	public String employeesOne(Model model,@RequestParam(value="id")String id){
		
		Employees employess=employeesService.findEmployeesByid(id);
		model.addAttribute("employess",employess);
		return null;
		
	}
		//跳转到修改密码页面
	@RequestMapping("/change.html")
		public String changePassword(Model model,@RequestParam(value="id")String id){
			model.addAttribute("id", id);
			return null;
			
		}
	
		@RequestMapping("/update.html")
		public String updatePassword(@RequestParam(value="id")String id,@RequestParam(value="password")String password){
			boolean result=employeesService.updatePasswordById(password, id);
			if(result){
				return "redirect:/login/login.html";
			}
			return null;
			
		}
	
	
	
	

}
