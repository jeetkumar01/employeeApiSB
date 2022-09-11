package com.jeet.demo.repository;

import com.jeet.demo.dto.EmployeeDto;
import com.jeet.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT new com.jeet.demo.dto.EmployeeDto( employee.id,employee.fName) FROM Employee employee")
    List<EmployeeDto> getEmployeeNames();
}
