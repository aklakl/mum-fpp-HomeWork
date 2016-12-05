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
public class Invoice implements Payable {
	
	String partNumber;
	
	String partDescription;
	
	int quantily;
	
	double pricePerItem;
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantily() {
		return quantily;
	}

	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public Invoice() {
		super();
		this.partNumber = "";
		this.partDescription = "";
		this.quantily = 0;
		this.pricePerItem = 0;
	}
	
	public Invoice(String partNumber,String partDescription,int quantily,double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantily = quantily;
		this.pricePerItem = pricePerItem;
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
		double result = this.quantily * this.pricePerItem;
		System.out.println(getClass().getSimpleName()+" class is "+result); 
		return result; 
	}

}
