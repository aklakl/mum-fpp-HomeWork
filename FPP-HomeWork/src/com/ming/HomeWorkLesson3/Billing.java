package com.ming.HomeWorkLesson3;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 1,2016
 * 
 * @description:    Solution for Quesetion 4 
 * 
 */

public class Billing {
	
	private double price;

	private int count = 1;
	
	private double tax = 0.08;
	
	private double totalPrice;
	
	public Billing() {
		
		
	}
	
	public  double computeBill(double money) {
		this.price = money;
		this.totalPrice = this.price+this.price*tax;
		return this.totalPrice;
    }
	
	public  double computeBill(double money,int count) {
		this.price = money;
		this.totalPrice = (this.price*this.count)+(this.price*this.count) *tax;
		return this.totalPrice;
    }
	
	
	public  double computeBill(double money,int count,double discount) {
		this.price = money;
		this.count = count;
		double totalMoney = (this.price*this.count)-(this.price*this.count)*discount;
		this.totalPrice = totalMoney + totalMoney * tax;
		return this.totalPrice;
    }

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Billing  billing = new Billing();
		double  price = 5;
		int count = 10;
		double discount = 0.10;
		double total;
		//test for computeBill 1 parameters
		total = billing.computeBill(price);
		System.out.println("computeBill 1 parameters total is:"+total);
		
		//test for computeBill 2 parameters
		total = billing.computeBill(price,count);
		System.out.println("computeBill 2 parameters total is:"+total);
		
		//test for computeBill 3 parameters
		total = billing.computeBill(price,count,discount);
		System.out.println("computeBill 3 parameters total is:"+total);
		
	}
	
	/*
	
	Sample output : 
	computeBill 1 parameters total is:5.4
	computeBill 2 parameters total is:5.4
	computeBill 3 parameters total is:48.6

	 */
	
	

}
