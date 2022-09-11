package com.jeet.demo.dto;

public class EmployeeDto {
    private Integer id;
    private String fName;

    public EmployeeDto(Integer id, String fName) {
        this.id = id;
        this.fName = fName;
    }

    public EmployeeDto() {
    }

    public Integer getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
}
