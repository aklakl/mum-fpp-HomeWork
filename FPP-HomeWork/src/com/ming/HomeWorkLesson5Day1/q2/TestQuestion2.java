package com.ming.HomeWorkLesson5Day1.q2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 3,2016
 * 
 * @description:    Test for com.ming.HomeWorkLesson5Day1 Quesetion 2 
 *
 */
public class TestQuestion2 {
 
	public TestQuestion2() {
		 
	}
 
	
	public static void main(String[] args) {
		//test for class DeptEmployee 
		DeptEmployee[] deptEmployeeList = new DeptEmployee[5];
		LocalDate hireDate =  LocalDate.now(); 
		deptEmployeeList[0] = new Professor("professor A",hireDate,5000,20);
		deptEmployeeList[1] = new Professor("professor B",hireDate,4000,10);
		deptEmployeeList[2] = new Professor("professor C",hireDate,3000,5);
		deptEmployeeList[3] = new Secretary("secretary D",hireDate,70,8);
		deptEmployeeList[4] = new Secretary("secretary E",hireDate,80,6);
		
		System.out.println("please input a character 'Y' or 'N': Do you wishes to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department ");
		Scanner scanner=new Scanner(System.in);
	   	String input =scanner.next(); 
	  	System.out.println("you input is :"+input);
	  	int loopIndex = 0;
	  	boolean flagView = false;
		if (input.toLowerCase().equals("y")){
			loopIndex = 0;
			flagView = true;
		}else{
			loopIndex = 3;
		}
		double salary = 0;
		for( ; loopIndex<deptEmployeeList.length;loopIndex++){
			DeptEmployee deptEmployee = deptEmployeeList[loopIndex];
			salary += deptEmployee.computeSalary(flagView);
		}
		System.out.println("the total salary is :"+salary);
		
	}

}
