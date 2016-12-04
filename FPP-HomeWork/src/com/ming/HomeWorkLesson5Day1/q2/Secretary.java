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
public class Secretary extends DeptEmployee{

	protected int overtimeHours = 0;
	
	public int getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public Secretary(String name,LocalDate hireDate,double salary,int overtimeHours ) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.overtimeHours = overtimeHours;
	}

	public double computeSalary(boolean flagView){
		double salary = this.salary + (this.overtimeHours*this.salary*12);
		if (flagView) System.out.println("the Secretary "+this.name+"'s salary is "+salary);
		return salary;
	}


}
