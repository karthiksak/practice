package com.karthik;

public class Invoice {

	String name;
	double spent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpent() {
		return spent;
	}

	public void setSpent(double spent) {
		this.spent = spent;
	}

	public Invoice(String name, double spent) {
		super();
		this.name = name;
		this.spent = spent;
	}

	
}
