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
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	double baseSalary;
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee() {
		super();
		this.baseSalary = 0;
	}
	
	public BasePlusCommissionEmployee(double grossSales,double commissionRate,double baseSalary) {
		super(grossSales,commissionRate);
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary) {
		super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
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
		double result = this.baseSalary + super.getPaymentAmount();
		System.out.println(getClass().getSimpleName()+" class is "+result); 
		return result;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.baseSalary+"\n";
	}
	
}
