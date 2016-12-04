package com.ming.HomeWorkLesson5Day1.q1;

import java.lang.reflect.Field;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 3,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson5Day1  Question 1  
 *
 */
public class Person {
	
	protected String Default = "Default";
	
	protected String name;
	
	protected String ssn;
	
	protected int age;
	
	protected String gender;
	
	protected String address;
	
	protected String telephone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Person() {
		this.name = this.Default + "Name";
		this.ssn = this.Default + " SSN Number";
		this.address = this.Default + " address";
		this.gender = "Male";
		this.age = 30;
		this.telephone = this.Default + " 1000000";
	}

	public void display(){
		System.out.println("invoke class Person's display()");
		System.out.println("attributeName:name	|attributeValue:" + this.name);
		System.out.println("attributeName:ssn	|attributeValue:" + this.ssn);
		System.out.println("attributeName:address	|attributeValue:" + this.address);
		System.out.println("attributeName:gender	|attributeValue:" + this.gender);
		System.out.println("attributeName:age	|attributeValue:" + this.age);
		System.out.println("attributeName:telephone	|attributeValue:" + this.telephone);
	}
 
	

}
