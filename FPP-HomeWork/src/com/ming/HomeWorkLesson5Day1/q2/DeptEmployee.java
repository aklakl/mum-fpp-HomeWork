package com.ming.HomeWorkLesson5Day1.q2;

import java.time.LocalDate;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 3,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day1  Question 2 
 *
 */
public class DeptEmployee {

	protected String name;

	protected LocalDate hireDate;

	protected double salary;//monthly or annual?
	
	public DeptEmployee() {
		
	}

	public double computeSalary(boolean flagView){
		if (flagView) System.out.println("the DeptEmployee "+this.name+"'s salary is "+salary);
		return salary;
	}

}
