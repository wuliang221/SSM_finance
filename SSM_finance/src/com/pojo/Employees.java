package com.pojo;

import java.util.Date;

public class Employees {
    private Integer id;

    private Integer departmentalno;

    private String password;

    private String name;

    private Integer gender;

    private Date entrytime;
    
    private String loginName;
    
    private Payroll pay;
    
    private Departmenta depart;
    private String departmentalName;
    
    
    
    
    

   
	public String getDepartmentalName() {
		return departmentalName;
	}

	public void setDepartmentalName(String departmentalName) {
		this.departmentalName = departmentalName;
	}

	public Payroll getPay() {
		return pay;
	}

	public void setPay(Payroll pay) {
		this.pay = pay;
	}

	public Departmenta getDepart() {
		return depart;
	}

	public void setDepart(Departmenta depart) {
		this.depart = depart;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentalno() {
        return departmentalno;
    }

    public void setDepartmentalno(Integer departmentalno) {
        this.departmentalno = departmentalno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }
}