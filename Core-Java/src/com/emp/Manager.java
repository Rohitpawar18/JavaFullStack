package com.emp;

public class Manager extends Employee {
	private double commission;
	
	public Manager(double salary, double commission) {
		super(salary);
		this.commission = commission;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commission;
	}
	
	
}
