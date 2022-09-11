package com.jeet.demo.controller;

import com.jeet.demo.dto.EmployeeDto;
import com.jeet.demo.entity.Employee;
import com.jeet.demo.exception.EmployeeNotFoundException;
import com.jeet.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
       String result = employeeService.addEmployee(employee);

    return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employee = employeeService.getEmployee();

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/employee/name")
    public ResponseEntity<List<EmployeeDto>> getEmployeeNames(){
        List<EmployeeDto> employee = employeeService.getEmployeeNames();
        System.out.println(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeDetails(@PathVariable int id) {

            Optional<Employee> employee = employeeService.getEmployeeDetails(id);
            try{
                if(employee.isPresent()){
                    return new ResponseEntity<>(employee, HttpStatus.OK);
                }else{
                    throw new EmployeeNotFoundException("Employee not found");
                }
            }catch(EmployeeNotFoundException ex){
                return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
            }
    }
}
