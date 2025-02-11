package com.emp_mgmt.Employee_Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp_mgmt.Employee_Management.entity.Employee;
import com.emp_mgmt.Employee_Management.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	 private EmployeeRepository employeeRepository;
	    
	    @Autowired
	    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository)
	    {
	        employeeRepository = theEmployeeRepository;
	    }
	    
	    @Override
	    public List<Employee> findAll() 
	    {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Employee findById(int theId) 
	    {
	        Optional<Employee> result = employeeRepository.findById(theId);
	        Employee theEmployee = null;
	        if(result.isPresent())
	            theEmployee = result.get();
	        else
	            throw new RuntimeException("Employee id not found - " + theId);
	        return theEmployee;
	    }

	    @Override
	    public void save(Employee theEmployee) 
	    {
	        employeeRepository.save(theEmployee);
	    }

	    @Override
	    public void deleteById(int theId) 
	    {
	        employeeRepository.deleteById(theId);
	    }

}
