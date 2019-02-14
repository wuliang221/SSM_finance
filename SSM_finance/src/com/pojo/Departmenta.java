package com.pojo;

public class Departmenta {
    private Integer id;

    private String departmentalName;

    private Integer personsNum;

    private Double wageCoefficient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentalName() {
        return departmentalName;
    }

    public void setDepartmentalName(String departmentalName) {
        this.departmentalName = departmentalName == null ? null : departmentalName.trim();
    }

    public Integer getPersonsNum() {
        return personsNum;
    }

    public void setPersonsNum(Integer personsNum) {
        this.personsNum = personsNum;
    }

    public Double getWageCoefficient() {
        return wageCoefficient;
    }

    public void setWageCoefficient(Double wageCoefficient) {
        this.wageCoefficient = wageCoefficient;
    }
}