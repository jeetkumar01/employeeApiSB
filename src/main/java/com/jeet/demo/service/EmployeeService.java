package com.jeet.demo.service;

import com.jeet.demo.dto.EmployeeDto;
import com.jeet.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public String addEmployee(Employee employee);
    public List<Employee> getEmployee() ;
    public Optional<Employee> getEmployeeDetails(int id);
    public List<EmployeeDto> getEmployeeNames();
}
