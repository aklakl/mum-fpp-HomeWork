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
public class Circle extends Shape {

	double radius;
	
	public Circle() {
		this.radius = 0;
	}

	public Circle(String shapeName,double radius) {
		super(shapeName);
		this.radius = radius;
	}

	@Override
	double computeArea() {
		return Math.PI*Math.sqrt(this.radius);
	}

	@Override
	double computePerimeter() {
		return Math.PI*this.radius;
	}

	@Override
	void readShapeData() {
		System.out.println("this Shape is a " + getClass().getSimpleName()+" radius is :"+this.radius);
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + this.radius;
	}
	
}
