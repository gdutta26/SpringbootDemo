package com.example.demo.controller;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employeeservice;

@RestController
@RequestMapping(value= "/api/mongo/emp")
public class Employeecontroller {

	@Autowired
	Employeeservice serv;

		
	//*** Method to save employees in the db.
	
	@PostMapping(value= "/create")
	public String create(@RequestBody Employee emp) {
		System.out.println("Saving employee.");
		serv.createEmployee(emp);
		return "Employee record created.";
	}
	
	// Method to fetch all employees from the db.
	 
	@GetMapping(value= "/getall")
	public Collection<Employee> getAll() {
		System.out.println("Getting all employees.");
		return serv.getAllEmployees();
	}

	
	 // Method to fetch employee by id.
	
	@GetMapping(value= "/getbyid/{employee-id}")
	public Optional<Employee> getById(@PathVariable(value= "employee-id") String id) {
		System.out.print("Getting employee with employee-id={"+id+"}");
		return serv.findEmployeeById(id);
	}

	
	 //Method to update employee by id.
	
	@PutMapping(value= "/update/{employee-id}")
	public String update(@PathVariable(value= "employee-id") String id, @RequestBody Employee e) {
	System.out.println("Updating employee with employee-id={"+id+"}");
		e.setId(id);
		serv.updateEmployee(e);
		return "Employee record for employee-id= " + id + " updated.";
	}

	
	//**** Method to delete employee by id.
	
	@DeleteMapping(value= "/delete/{employee-id}")
	public String delete(@PathVariable(value= "employee-id") String id) {
		System.out.println("deleting employee with employee-id={"+id+"}");
		serv.deleteEmployeeById(id);
		return "Employee record for employee-id= " + id + " deleted.";
	}

	
}