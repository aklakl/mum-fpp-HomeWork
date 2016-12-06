package com.ming.HomeWorkLesson5Day3.q3;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day3 Quesetion 3 
 *
 */
public class Computer {

	String manufacturer;
	
	String processor;
	
	int ramSize;
	
	int diskSize;
	
	double processorSpee;
	
	public Computer() {
		
	}
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpee) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpee = processorSpee;
	}

	// Make a Constructor to initialize the instance fields 
	int getRamSize(){
		return ramSize;
	}
	
	int getDiskSize(){
		return diskSize;
	}
	
	double getProcessorSpeed() {
		return processorSpee;
	}
	
	double computePower(){
		return diskSize;
	}
	// return ramSize multiplied by processorSpeed Override the toString() method to display the current status 

	@Override
	public boolean equals(Object anObject){
		boolean result = false;
		if (super.equals(anObject)){
			result = true;
		}
		System.out.println(getClass().getSimpleName() + " equals result："+result);
		return result;
	}
	
	@Override
	public int hashCode(){
		int result = super.hashCode();
		System.out.println(getClass().getSimpleName() + " hashCode: "+result);
		return result;
	}

	public static void main(String[] args) {
		//Test for com.ming.HomeWorkLesson5Day3 Quesetion 3  class Computer 
		Computer computer1 = new Computer();
		Computer computer2 = new Computer();
		computer1.hashCode();
		computer2.hashCode();
		
		computer1.equals(computer2);
		
		
	}
	
	
}
