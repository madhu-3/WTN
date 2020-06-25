package com.wipro.inheritance;

public class Employee extends Person{
	double annualSalary;
	int year;
	String insuranceno;
	Employee(double annualSalary,int year,String insuranceno)
	{
		super("John");
		this.annualSalary=annualSalary;
		this.year=year;
		this.insuranceno=insuranceno;
	}
	public void display()
	{
	System.out.println("His salary is " +annualSalary+ " year of joining is " +year+ " and his insurance number is "+insuranceno);
}
}