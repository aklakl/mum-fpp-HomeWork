package com.ming.HomeWorkLesson5Day2.q1;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day2  Lesson – 5 – Inheritance and Polymorphism. Day – 2 – Solve Problem 1 
 *
 */ 
public class HourlyEmployee extends Employee {
	
	double wage;
	
	double hours;
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}


	public HourlyEmployee() {
		super();
		this.hours = 0;
		this.wage = 0;
	}
	
	public HourlyEmployee(double wage,double hours) {
		super();
		this.hours = hours;
		this.wage = wage;
	}
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage,double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.hours = hours;
		this.wage = wage;
	}

	/*
	1. CommissionEmployee : grossSales * CommisionRate   
	2. BasePlusCommisionEmployee : baseSalary + (grossSales * CommisionRate)   
	3. HourlyEmployee : wage * hours  
	4. SalariedEmployee : weeklySalary 
	5. Invoice : quantity * pricePerItem 
	*/
	@Override
	public double getPaymentAmount() {
		double result = this.wage*this.hours;
		System.out.println(getClass().getSimpleName()+" class is "+result); 
		return result;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.hours+"\n"+this.wage;
	}
	

}
