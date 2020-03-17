package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document
public class Employee {

	@Id
	private String id;
	private String name;
	private String lname;
	private String designation;

	public Employee() {	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getlname() {
		return lname;
	}
	
	public void setlname(String lname) {
		this.lname= lname;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",lname=" + lname + ", designation=" + designation + "]";
	}

	
}