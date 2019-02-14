package com.pojo;

import java.math.BigDecimal;

public class Payroll {
    private Integer id;

    private Integer employeeno;

    private BigDecimal basepay;

    private BigDecimal jobsubsidy;

    private BigDecimal worksubsidy;

    private BigDecimal subsidy;
    
    private String name;

   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(Integer employeeno) {
        this.employeeno = employeeno;
    }

    public BigDecimal getBasepay() {
        return basepay;
    }

    public void setBasepay(BigDecimal basepay) {
        this.basepay = basepay;
    }

    public BigDecimal getJobsubsidy() {
        return jobsubsidy;
    }

    public void setJobsubsidy(BigDecimal jobsubsidy) {
        this.jobsubsidy = jobsubsidy;
    }

    public BigDecimal getWorksubsidy() {
        return worksubsidy;
    }

    public void setWorksubsidy(BigDecimal worksubsidy) {
        this.worksubsidy = worksubsidy;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }
}