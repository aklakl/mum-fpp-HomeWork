package com.ming.HomeWorkLesson5Day1.q1;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 3,2016
 * 
 * @description: Solution for com.ming.HomeWorkLesson5Day1 Question 1
 *
 */
public class Employee extends Person {

	protected String department;

	protected String jobTitle;

	protected Date hireDate;

	protected String addition;

	protected double hourlyFate;

	protected int hoursWorked;

	protected double unionDues;

	protected double annualSalary;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getAddition() {
		return addition;
	}

	public void setAddition(String addition) {
		this.addition = addition;
	}

	public double getHourlyFate() {
		return hourlyFate;
	}

	public void setHourlyFate(double hourlyFate) {
		this.hourlyFate = hourlyFate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getUnionDues() {
		return unionDues;
	}

	public void setUnionDues(double unionDues) {
		this.unionDues = unionDues;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public Employee() {

	}

	public void display() {
		super.display();
		System.out.println("invoke class Employee's display()");
		Class cls = this.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			f.setAccessible(true);
			try {
				System.out.println("attributeName:" + f.getName() + "	|attributeValue:" + f.get(this));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}


}
