package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Assetcategory;
import com.service.AssetcategoryService;
import com.util.PageSupport;

@Controller
@RequestMapping("/assetcategory")
public class AssetcategoryController {
	
	private Logger log = Logger.getLogger(AssetcategoryController.class);
	
	@Resource
	private AssetcategoryService assetcategoryService;
	
	@RequestMapping("/assetcategory.html")
	public String assetcategory(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo
			) {

		int result = assetcategoryService.assetCount();
		if (pageNo == null || pageNo == "") {
			pageNo = "1";
		}
		int currPageNo = Integer.parseInt(pageNo);
		if (currPageNo < 1) {
			currPageNo = 1;
		}
		System.out.println(currPageNo);
		PageSupport ps = new PageSupport();
		ps.setPageSize(5);
		ps.setTotalCount(result);
		if (currPageNo > ps.getTotalPageCount()) {
			currPageNo = ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index = (ps.getCurrPageNo() - 1) * ps.getPageSize();
		if (index < 0) {
			index = 1;
		}
		log.info("==========================" + (ps.getCurrPageNo() - 1)
				* ps.getPageSize());

		List<Assetcategory> assetcategory = assetcategoryService.selectAll(index, ps.getPageSize());
		System.out.println(assetcategory);
		model.addAttribute("assetcategory", assetcategory);
		model.addAttribute("ps", ps);
		return "Table/Tables4";

	}
	
	@RequestMapping("/add.html")
	public String add(){
		return null;
	}
	
	@RequestMapping("/doadd.html")
	public String doadd(@RequestParam("name")String name){
		int result=assetcategoryService.add(name);
		if(result>0){
			return null;
		}
		return null;
	}
	@RequestMapping("/del.html")
	public String del(@RequestParam("id")Integer id,@RequestParam("del")Integer del){
		int result=0;
		if(del==1){
			result=assetcategoryService.del(id, 0);
			return null;
			
		}else if(del==0){
			result=assetcategoryService.del(id, 1);
			return null;
		}
		return null;
	}
	@RequestMapping("/update.heml")
	public String upade(@RequestParam("id")Integer id){
		return null;
	}
	@RequestMapping("/doupdate.heml")
	public String doupade(@RequestParam("id")Integer id,@RequestParam("name")String name){
		return null;
	}

}
