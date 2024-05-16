package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Entity.Employee;
import com.app.Repository.EmployeeRepo;

@Service
@Transactional

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public List<Employee> findAllEmp() {
		
		return repo.findAll();
	}

	@Override
	public void addEmp(Employee e) {
     repo.save(e);
		
	}

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		 repo.deleteById(id);
		
	}

//	@Override
//	public Employee getById(Long Id ) {
//		
//		Optional<Employee> e= repo.findById(Id);
//		if(e.isPresent()) {
//			return e.get();
//		}
//		return null;
	
	
	



}
