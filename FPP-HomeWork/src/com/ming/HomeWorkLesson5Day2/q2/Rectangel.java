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
public class Rectangel extends Shape {

	double width;
	
	double height;
	
	public Rectangel() {
		this.width = 0;
		this.height = 0;
	}

	public Rectangel(String shapeName,double width, double height) {
		super(shapeName);
		this.width = width;
		this.height = height;
	}

	@Override
	double computeArea() {
		return this.width * this.height;
	}

	@Override
	double computePerimeter() {
		return this.width * 2 + this.height * 2;
	}

	@Override
	void readShapeData() {
		System.out.println("this Shape is a "+ getClass().getSimpleName()+" width is :"+this.width+"|height is "+this.height);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + this.width + "\n" + this.height;
	}
	

}
