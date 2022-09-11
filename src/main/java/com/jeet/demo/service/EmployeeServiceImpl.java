package com.jeet.demo.service;

import com.jeet.demo.dto.EmployeeDto;
import com.jeet.demo.entity.Employee;
import com.jeet.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Added successfully";
    }

    @Override
    public List<Employee> getEmployee() {
      return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeDetails(int id) {
      Optional<Employee> employee=employeeRepository.findById(id);
        return employee;
    }

    @Override
    public List<EmployeeDto> getEmployeeNames() {
        List<EmployeeDto> employee=employeeRepository.getEmployeeNames();
        return employee;
    }
}
