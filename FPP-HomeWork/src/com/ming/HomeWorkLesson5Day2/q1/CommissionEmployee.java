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
public class CommissionEmployee extends Employee {

	double grossSales;
	
	double commissionRate;
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee() {
		super();
		this.grossSales = 0;
		this.commissionRate = 0;
	}
	
	public CommissionEmployee(double grossSales,double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commissionRate) {
		super(firstName,lastName,socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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
		double result = this.grossSales*this.commissionRate;
		System.out.println(getClass().getSimpleName()+" class is "+result); 
		return result;
	}
	

}
