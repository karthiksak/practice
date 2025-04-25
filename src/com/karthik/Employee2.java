package com.karthik;

public class Employee2 {

	private String departNames;
	private String name;

	public Employee2(String departNames, String name, double salary) {
		super();
		this.departNames = departNames;
		this.name = name;
		this.salary = salary;
	}

	public String getDepartNames() {
		return departNames;
	}

	public void setDepartNames(String departNames) {
		this.departNames = departNames;
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

	private double salary;
}
