package com.ming.HomeWorkLesson3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 1,2016
 * 
 * @description:    Solution for Quesetion 3 
 * 
 */

public class HeartRates {

	public String firstName;
	
	public String lastName ;
	
	public String birthDate;
	
	public int  beats = 220;
	
	
	 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
	public double RHR = 70;
	public double LB = 0.5;
	public double UB = 0.85;
	
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getBeats() {
		return beats;
	}

	public void setBeats(int beats) {
		this.beats = beats;
	}

	public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today);
    }
    
	HeartRates(){
		this("defaultPerson","","1980-01-01");
	}
	
	HeartRates(String firstName,String lastName,String birthDate ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	//a. a method that calculates and returns the person’s age (in years), 
	public int getAge(){
		LocalDate birthday = LocalDate.parse(this.birthDate, formatter);
        Period age = calculateAge(birthday);
        //System.out.printf("Today you are %d years, %d months and %d days old%n",age.getYears(), age.getMonths(), age.getDays());
		return age.getYears();
	}
	
 
	//b. a method that calculates and returns the person’s maximum heart rate and
	public int getMaximumHeart(){
		return beats - this.getAge();
	}

	
	//c. a method that calculates and prints the person’s target heart rate range.
	public void getTargetHearRateRange(){
		System.out.println("American Heart Association(AHA)");
		System.out.println(this.firstName+"'s TargetHearRateRange is mentioned below ");
		double  AHR,LBTHR,UBTHR;
		AHR =  (double)getMaximumHeart() - this.RHR;
		LBTHR = (AHR*this.LB) + this.RHR;
		UBTHR = (AHR*this.UB) + this.RHR;
		
		System.out.println("Assign Resting Heart Rate(RHR) ="+this.RHR);
		System.out.println("Calculate Average Heart Rate(AHR) = "+AHR);
		System.out.println("Assign Lower Boundary(LB) = "+this.LB);
		System.out.println("Assign Upper Boundary(UB) = "+this.UB);
		System.out.println("Calculate Lower Boundary Target Heart Rate (LBTHR) = "+LBTHR);
		System.out.println("Calculate Upper Boundary Target Heart Rate (UBTHR) = "+UBTHR);
		System.out.println("The Result of Target Heart Rate Range is between "+LBTHR+" and "+UBTHR);
		System.out.println("======================================");
	}
	
	
	//d. a method need to display the person’s first name, last name and date of birth, person’s age in (years), maximum heart rate(MHR) and target-heart-rate range(option g derived).
	public void getTargetHearRateRangeForQuestionD(){
		System.out.println("this person firstName is "+this.firstName+"  lastName is "+this.lastName);
		System.out.println(this.firstName+"'s birthDay is "+this.birthDate);
		System.out.println("This year "+this.firstName+"'s age is "+ this.getAge());
		double maximumHeart = this.getMaximumHeart();
		System.out.println(this.firstName+" Maximum Heart is "+maximumHeart);
		System.out.println(this.firstName+"'s target-heart-rate range :" + maximumHeart*0.5 + " to "+maximumHeart*0.85);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//test for HeartRates
		HeartRates hearRate = new HeartRates("Ming","Li","1985-09-15");
		
		int age = hearRate.getAge();
		System.out.println(hearRate.firstName+" age is "+age);
		System.out.println("");
		
		int maximumHeart = hearRate.getMaximumHeart();
		System.out.println(hearRate.firstName+" Maximum Heart is "+maximumHeart);
		System.out.println("");
		
		hearRate.getTargetHearRateRange();
		//System.out.println(hearRate.firstName+"'s TargetHearRateRange is up  ");
		System.out.println("");
		
		hearRate.getTargetHearRateRangeForQuestionD();
		
		
	}
	
	
	 
	
	 
	
	
	 


}
