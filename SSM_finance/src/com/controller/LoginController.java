package com.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Admin;
import com.pojo.Departmenta;
import com.pojo.Employees;
import com.service.AdminService;
import com.service.DepartmentaService;
import com.service.EmployeesService;

/**
 * ��½������
 * @author DELL
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private DepartmentaService departmentaService;
	
	private Logger log = Logger.getLogger(LoginController.class);
	
	@Resource
	private AdminService adminService;
	@Resource
	private EmployeesService employeesService;
	
	/**
	 * ���ص�½ҳ
	 * @return
	 */
	@RequestMapping("/login.html")
	public String loginIn(){
		return "login";
	}
	
	/**
	 * �������Ա��ҳ
	 * @return
	 */
	@RequestMapping("/index.html")
	public String indexIn(Model model){
		List<Departmenta> depalist=departmentaService.getAllDepart1();
		model.addAttribute("depalist", depalist);
		System.out.println(depalist);
		return "MyJsp";
	}

	
	
	
	/**
	 * ������ͨԱ����ҳ
	 * @return
	 */
	@RequestMapping("/index2.html")
	public String indexIn2(){
		return "index2";
	}
	
	/**
	 * ��½
	 * @param name
	 * @param password
	 * @param choose
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/first.html",method=RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam(value="name")String name,
						@RequestParam(value="password")String password,
						@RequestParam(value="choose")Integer choose,
						HttpSession session,HttpServletRequest request){
		
/*		Map<String,String> userN=new HashMap<String, String>();
*/		System.out.println(choose);
		String json="";
		if(choose==1){
			Admin admin=adminService.findAdmin(name,password);
			
			if(admin!=null){
			session.setAttribute("name", admin.getAdminname());
			json="session1";
			System.out.println(admin.getAdminname()+""+admin.getAdminpwd());
			}
		}else if(choose==2){
			Employees employess =employeesService.findEmployees(name, password);
			if(employess!=null){
			session.setAttribute("name", employess.getName());
			json="session1";
			}
		}
		
		return json;
		
		
	}

}
