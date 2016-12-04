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
public class Student extends Person{
	
	protected float average ;//(GPA),
	
	protected String major; 
	
	protected String year ;
	
	protected String graduation;
	
	public Student() {
		 this.average = 0;
		 this.major = Default + " Major";
		 this.year = Default + " year";
		 this.graduation = Default + " graduation";
	}
	
	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
 
	public void display(){
		super.display();
		System.out.println("invoke class Student's display()");
		Class cls = this.getClass();
		Field[] fields = cls.getDeclaredFields();  
		for(int i=0; i<fields.length; i++){  
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
