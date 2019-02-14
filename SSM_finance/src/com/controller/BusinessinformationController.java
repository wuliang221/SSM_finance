package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Businessinformation;
import com.service.BusinessinformationService;
import com.util.PageSupport;

@Controller
@RequestMapping("/businessin")
public class BusinessinformationController {
	
	private Logger log = Logger.getLogger(BusinessinformationController.class);
	
	@Resource
	private BusinessinformationService businessinformationService;
	
	
	@RequestMapping("/businessin.html")
	public String Businessin(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo
			) {

		int result = businessinformationService.Count();
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

		List<Businessinformation> businessin = businessinformationService.findBusiness(index, ps.getPageSize());
		System.out.println(businessin);
		model.addAttribute("businessin", businessin);
		model.addAttribute("ps", ps);
		return "Table/Tables6";

	}


}
