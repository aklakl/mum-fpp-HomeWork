package com.ming.HomeWorkLesson5Day2.q2;
/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day2 Quesetion 2 
 *
 */
public abstract class Shape {

	String shapeName;
	
	String getShapeName(){
		return shapeName;
	}
	
	public Shape() {
		//
	}
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	public String toString(){
		return super.toString() + "\n" + getClass().getSimpleName()+"\n"+ this.shapeName;
	}
	
	abstract double computeArea();
	
	abstract double computePerimeter();
	
	abstract void readShapeData();

	

 

}
