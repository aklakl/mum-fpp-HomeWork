package com.ming.HomeWorkLesson5Day2.q1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day2  Lesson – 5 – Inheritance and Polymorphism. Day – 2 – Solve Problem 1 
 *
 */
public class TestForQuestion1 {
 
	public TestForQuestion1() {
		 
	}
 
	/*
	1. CommissionEmployee : grossSales * CommisionRate   
	2. BasePlusCommisionEmployee : baseSalary + (grossSales * CommisionRate)   
	3. HourlyEmployee : wage * hours  
	4. SalariedEmployee : weeklySalary 
	5. Invoice : quantity * pricePerItem 
	*/
	public static void main(String[] args) {
		//test for class HomeWorkLesson5Day2 Question 1
		Object[] employeeArray = {
			new CommissionEmployee("Ming","Li","232301198509150014",13,0.10),
			new BasePlusCommissionEmployee("John","Lee","111111111111111111",12,0.10,2.6),
			new HourlyEmployee("Joseph","bexerman","123456789012345678",11,0.25),
			new SalariedEmployee("box","liu","2222222222222222",10),
			new Invoice("test","test1",123,0.11),
		};
		
		for (Object obj : employeeArray ){
			Payable payable =(Payable)obj ;
			payable.getPaymentAmount();
			System.out.println("=====================");
			System.out.println(payable.toString());
		}
		//System.out.println("the total salary is :"+salary);
		
	}

}
