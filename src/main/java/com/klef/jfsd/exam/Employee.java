package com.klef.jfsd.exam;

import java.util.List;

public class Employee 
{
	private int employeeId;
	private String name;
	private double salary;
	private String Department;
	private List<String> skills;
	
	public Employee(int employeeId, String name, double salary, String department, List<String> skills) 
	{
		//super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		Department = department;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", Department="
				+ Department + ", skills=" + skills + "]";
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
