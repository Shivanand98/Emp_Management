package com.emp_mgmt.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp_mgmt.Employee_Management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
