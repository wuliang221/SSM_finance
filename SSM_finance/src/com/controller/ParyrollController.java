package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Payroll;
import com.service.PayrollService;
import com.util.PageSupport;

@Controller
@RequestMapping("/paryroll")
public class ParyrollController {
	private Logger log = Logger.getLogger(ParyrollController.class);

	@Resource
	private PayrollService payrollService;

	@RequestMapping("/paryroll.html")
	public String paryroll(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo
			) {

		int result = payrollService.countPary();
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

		List<Payroll> paryroll = payrollService.findAll(index, ps.getPageSize());
		System.out.println(paryroll);
		model.addAttribute("paryroll", paryroll);
		model.addAttribute("ps", ps);
		return "Table/Tables3";

	}

}
