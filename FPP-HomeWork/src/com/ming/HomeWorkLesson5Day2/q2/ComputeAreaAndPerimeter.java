package com.ming.HomeWorkLesson5Day2.q2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:    Test for com.ming.HomeWorkLesson5Day2 Quesetion 2 
 *
 */
public class ComputeAreaAndPerimeter {
 
	public ComputeAreaAndPerimeter() {
		 
	}
	
	public static Shape getShape() {
		System.out.println("Enter C for Circle ");
		System.out.println("Enter R for Rectangle ");
		System.out.println("Enter T for Right Triangle ");
		Scanner in = new Scanner(System.in);
		char choice = in.next().toLowerCase().charAt(0); //Read a Char from the console
		Shape shape = null;
		int height;
		switch (choice){
			case 'c':
				System.out.println("Enter radius for Circle ");
				int radius =  in.nextInt();
				shape = new Circle("Circle",radius); 
	            break;
			case 'r':
				System.out.println("Enter width  for Rectangel ");
				int width =  in.nextInt();
				System.out.println("Enter height for Rectangel ");
				height =  in.nextInt();
				shape = new Rectangel("Rectangel",width,height);
	            break;
			case 't':
				System.out.println("Enter base  for RtTriangle ");
				int base =  in.nextInt();
				System.out.println("Enter height for RtTriangle ");
				height =  in.nextInt();
				shape = new Rectangel("RtTriangle",base,height);
	            break;
			default:
				System.out.println("your input is wrong ");
		}
		shape.readShapeData();
		System.out.println("The Area is :"+shape.computeArea());
		System.out.println("The Perimeter is :"+shape.computePerimeter());
		System.out.println("shape.toString():"+shape.toString());
		return shape;
		
	}
	
	public static void main(String[] args) {
		//test for class all of Shape  
		getShape();
		
	}

}
