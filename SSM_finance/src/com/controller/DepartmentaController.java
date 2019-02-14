package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Departmenta;
import com.service.DepartmentaService;
import com.util.PageSupport;

@Controller
@RequestMapping("/depart")
public class DepartmentaController {
	
	private Logger log = Logger.getLogger(DepartmentaController.class);
	
	@Resource
	private DepartmentaService departmentaService;
	
	@RequestMapping("/depart.html")
	public String findALL(Model model,@RequestParam(value="pageNo",required=false)String pageNo){
		
		int result=departmentaService.countDepart();
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
		List<Departmenta> departList=departmentaService.findAllDepart(index,ps.getPageSize());
		System.out.println(departList);
		model.addAttribute("departList", departList);
		model.addAttribute("ps", ps);
		return "Table/Tables1";
		
	}

	@RequestMapping(value="/doadd.html",method=RequestMethod.POST)
	@ResponseBody
	public Object add(@RequestParam("departmentalName")String departmentalname,
					@RequestParam("personsNum")String personsnum,
					@RequestParam("wageCoefficient")String wageCoefficient){
		String json=null;
		Integer person=Integer.parseInt(personsnum);
		Double wage=Double.parseDouble(wageCoefficient);
		int result=0;
		result=departmentaService.add(departmentalname, person, wage);
		if(result>0){
			/*return "redirect:/depart/depart.heml";*/
			return json="sucesses";
		}
		return json;
		
	}
	@RequestMapping("/select.html")
	public String select(Model model){
		List<Departmenta> depalist=departmentaService.getAllDepart1();
		model.addAttribute("depalist", depalist);
		System.out.println(depalist);
		return "module/modal_box";
		
	}
	
	
	
}
