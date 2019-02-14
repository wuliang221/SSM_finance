package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Assetsinformation;
import com.service.AssetsinformationService;
import com.util.PageSupport;
@Controller
@RequestMapping("/assetsinformation")
public class AssetsinformationController {
	
private Logger log = Logger.getLogger(AssetsinformationController.class);
	
	@Resource
	private AssetsinformationService assetsinformationService;
	
	@RequestMapping("/assetsinformation.html")
	public String assetcategory(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo
			) {

		int result = assetsinformationService.countAll();
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

		List<Assetsinformation> assetsinformation = assetsinformationService.findAll(index, ps.getPageSize());
		System.out.println(assetsinformation);
		model.addAttribute("assetsinformation", assetsinformation);
		model.addAttribute("ps", ps);
		return "Table/Tables5";

	}


}
