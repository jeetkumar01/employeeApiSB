package com.jeet.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private Integer id;
    private String fName;
    private String lName;
    private String companyName;

    public Employee() {
    }

    public Employee(Integer id, String fName, String lName, String companyName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.companyName = companyName;
    }
    public Employee(Integer id, String fName) {
        this.id = id;
        this.fName = fName;
    }

    public Integer getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
