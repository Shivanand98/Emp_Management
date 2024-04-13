package com.emp_mgmt.Employee_Management.service;

import java.util.List;

import com.emp_mgmt.Employee_Management.entity.Employee;


public interface EmployeeService {

public List<Employee> findAll();
    
    public Employee findById(int theId);
    
    public void save(Employee theEmployee);
    
    public void deleteById(int theId);
}
