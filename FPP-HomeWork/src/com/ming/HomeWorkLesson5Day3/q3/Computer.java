package com.ming.HomeWorkLesson5Day3.q3;

import java.lang.reflect.Field;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day3 Quesetion 3 
 *
 */
public class Computer implements Cloneable {

	public String manufacturer;
	
	String processor;
	
	int ramSize;
	
	int diskSize;
	
	double processorSpee;
	
	public Computer() {
		super();
		this.manufacturer = "";
		this.processor = "";
		this.ramSize = 0;
		this.diskSize = 0;
		this.processorSpee = 0;
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
	
	public Object clone() throws CloneNotSupportedException {
		Computer clone=(Computer)super.clone();
		return clone;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

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
	public String toString(){
		StringBuilder sb = new StringBuilder();
		//System.out.println("invoke class "+getClass().getSimpleName() +"'s toString()");
		Class cls = this.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			f.setAccessible(true);
			try {
				sb.append(" attributeName:");
				sb.append(f.getName());
				sb.append("|attributeValue:");
				sb.append( f.get(this));
				if (i != fields.length-1){
					sb.append(",");
				}
				//System.out.println("attributeName:" + f.getName() + "	|attributeValue:" + f.get(this));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object oComputer){
		if (oComputer == null ) return false;
		if(!(oComputer instanceof Computer)) return false;
		Computer iComputer = (Computer)oComputer;
		boolean result = false;
		if (this.manufacturer.equals(iComputer.manufacturer) && 
			this.processor.equals(iComputer.processor) &&
			this.ramSize == iComputer.ramSize &&
			this.diskSize == iComputer.diskSize &&
			this.processorSpee == iComputer.processorSpee){
			result = true; 
		}
		//System.out.println(getClass().getSimpleName() + " equals result："+result);
		return result;
	}
	
	@Override
	public int hashCode(){
		//this.hashCode();//the object's previous hashCode
		int result = 11;
		//System.out.println(getClass().getSimpleName() + " history hashCode: " + super.hashCode());
		result = (int) (result + 17+ this.manufacturer.hashCode() +this.processor.hashCode() + this.ramSize + this.diskSize + this.processorSpee);//this is the object's  Override  hashCode  
		//System.out.println(getClass().getSimpleName() + " newly hashCode: " + result);
		return result;
	}

	public static void main(String[] args) {
		//Test for com.ming.HomeWorkLesson5Day3 Quesetion 3  class Computer 
		Computer computer1 = new Computer("computer1", "processor", 128, 1024, 24);
		Computer computer2 = new Computer("computer1", "processor", 128, 1024, 24);
		Computer computer3 = new Computer("IBM", "intel", 128, 1024, 24);
		System.out.println("computer1 hashCode:"+computer1.hashCode());
		System.out.println("computer2 hashCode:"+computer2.hashCode());
		System.out.println("computer3 hashCode:"+computer3.hashCode());
		
		System.out.println("===============================");
		
		System.out.println("computer1 toString:"+computer1.toString());
		System.out.println("computer2 toString:"+computer2.toString());
		System.out.println("computer3 toString:"+computer3.toString());
		System.out.println("===============================");
		
		System.out.println("computer1 compare computer2 result:"+computer1.equals(computer2));
		System.out.println("computer1 compare computer3 result:"+computer1.equals(computer3));
		System.out.println("computer2 compare computer3 result:"+computer2.equals(computer3)); 
		
		
	}
	
	
}
