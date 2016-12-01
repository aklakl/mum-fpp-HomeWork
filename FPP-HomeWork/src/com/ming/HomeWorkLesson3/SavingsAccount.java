package com.ming.HomeWorkLesson3;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 1,2016
 * 
 * @description:    Solution for Quesetion 5 
 * 
 */

public class SavingsAccount {
	
	public static double annualInterestRate ;
	
	private double savingsBalance  = 0 ;
	
	private static int month = 12;

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public void calculateMonthlyCompoundInterest (String flag){
		double monthly = SavingsAccount.annualInterestRate/12.00;
		for(int i = 1;i<13;i++){
			this.savingsBalance = this.savingsBalance*monthly+this.savingsBalance;
			System.out.println("the "+flag+"'"+i+" compound interest month savingsBalance is "+this.savingsBalance);
		}
	}
	
	public void calculateMonthlyInterest (String flag){
		//this.calculateMonthlyompoundInterest(flag);
		double monthlyInterest = this.savingsBalance*SavingsAccount.annualInterestRate/this.month;
		for(int i = 0;i<month;i++){
			this.savingsBalance += monthlyInterest;
			System.out.println("the "+flag+"'"+(i+1)+" interest month savingsBalance is "+this.savingsBalance);
		}
	}
	
	public static void modifyInterestRate (double rate){
		SavingsAccount.annualInterestRate = rate;
	}
	
	
	
	
	
	/**
	 * Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders. Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12— this interest should be added to savings-Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the new balances for both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers. 
	 * @param args
	 */
	public static void main(String[] args) {
		//test for question 1
		SavingsAccount saverA = new SavingsAccount();
		SavingsAccount saverB = new SavingsAccount();
		saverA.setSavingsBalance(2000.00);
		saverB.setSavingsBalance(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		saverA.calculateMonthlyInterest("saverA");
		saverB.calculateMonthlyInterest("saverB");
		
		System.out.println("==========================================");

		
		saverA.setSavingsBalance(2000.00);
		saverB.setSavingsBalance(3000.00);
		
		SavingsAccount.modifyInterestRate(0.05);
		
		saverA.calculateMonthlyInterest("saverA");
		saverB.calculateMonthlyInterest("saverB");
		
		
	}
	
	
	 
	
	 
	
	
	 


}
