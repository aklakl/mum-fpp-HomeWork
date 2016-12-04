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
public class Professor extends DeptEmployee{

	protected double numberOfPublications;
	
	public double getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(double numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public Professor(String name,LocalDate hireDate,double salary,double publications ) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.numberOfPublications = publications;
	}


	public double computeSalary(boolean flagView){
		double salary = this.salary + this.numberOfPublications;
		if (flagView) System.out.println("the Professor "+this.name+"'s salary is "+salary);
		return salary;
	}

}
