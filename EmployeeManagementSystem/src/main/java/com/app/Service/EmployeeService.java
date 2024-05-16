package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Entity.Employee;
import com.app.Repository.EmployeeRepo;

public interface EmployeeService {
	

	public List<Employee> findAllEmp();
		
	public void addEmp (Employee e);
	
	public Employee getById(Long id );
	
	
    public Employee updateEmployee(Employee employee);
    
    public void deleteEmployeeById(Long id);
}
