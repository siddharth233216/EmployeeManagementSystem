package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.Entity.Employee;
import com.app.Service.EmployeeService;

@Controller
//@CrossOrigin("http://localhost:3000/")
@RequestMapping("/Employee")

public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/emp")
	public String findAllEmp(Model model) {
		List<Employee> employees = service.findAllEmp();
		model.addAttribute("employees", employees);
		return "index";
	}

	@GetMapping("/emp/new")
	public String CreateNewEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_Employee";
	}
	
	
	@PostMapping("/emp")
	public String addEmp(@ModelAttribute("employee") Employee employee) {
	    service.addEmp(employee);
	    return "redirect:/Employee/emp";
	}

	@GetMapping("/emp/edit/{id}")
	public String  editEmployee(@PathVariable long id, Model model) {
		model.addAttribute("employee", service.getById(id));
		return "edit_Employee";
	}

	@PostMapping("/emp/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee")Employee employee,
			Model model) {
		//get student from database by id
		
		Employee existingEmployee=service.getById(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setContact(employee.getContact());
		
		//save updated student object
		service.updateEmployee(existingEmployee);
		return "redirect:/Employee/emp";
	}
	
	@GetMapping("emp/{id}")
public String deleteStudent(@PathVariable Long id) {
		service.deleteEmployeeById(id);
	return "redirect:/Employee/emp";
		
	}	
}
