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
public class RtTriangle extends Shape {

	double base;
	
	double height;
	
	public RtTriangle() {
		this.base = 0;
		this.height = 0;
	}

	public RtTriangle(String shapeName, double base, double height) {
		super(shapeName);
		this.base = base;
		this.height = height;
	}

	@Override
	double computeArea() {
		return (this.base*this.height)/2;
	}

	@Override
	double computePerimeter() {
		return this.base *3;
	}

	@Override
	void readShapeData() {
		System.out.println("this Shape is a "+getClass().getSimpleName()+" base is :"+this.base+"|height is "+this.height);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.base + "\n" + this.height;
	}
	
	
}
