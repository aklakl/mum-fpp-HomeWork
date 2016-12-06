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
public class SalariedEmployee extends Employee {

	double weeklySalary;
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee() {
		super();
		this.weeklySalary = 0;
	}
	
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
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
		double result = this.weeklySalary;
		System.out.println(getClass().getSimpleName()+" class is "+result); 
		return result; 
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.weeklySalary+"\n";
	}

}
