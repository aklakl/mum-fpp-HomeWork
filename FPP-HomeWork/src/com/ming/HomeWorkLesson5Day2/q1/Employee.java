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
public abstract class Employee implements Payable {

	String firstName;
	
	String lastName;
	
	String socialSecurityNumber;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Employee() {
		this.firstName = "defaultFirstName";
		this.lastName =  "defaultLastName";
		this.socialSecurityNumber = "";
	}

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.firstName+"\n"+this.lastName+"\n"+this.socialSecurityNumber;
	}

}
