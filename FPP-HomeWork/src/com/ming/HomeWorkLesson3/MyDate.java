package com.ming.HomeWorkLesson3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Nov 30,2016
 * 
 * @description:     Solution for  Extra Credit Quesetion 1 
 * 
 */

public class MyDate {
	private int year;
	private int MM;
	private int dd;
	private String format1[] ={"yyyy-MM-dd","yyyy-MM-dd"} ;
	private String format2[] ={"MM/DD/YYYY","MM/dd/yyyy"};
	private String format3[] ={"Month DD,YYYY","MMM dd,yyyy"};
	private String format4[] ={"DDD,YYYY","DDD,yyyy"};
	private Date curDate = new Date();
	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format1);
	SimpleDateFormat sdf = new SimpleDateFormat(format1[0]); 
	 
	 
	 
 
	public MyDate() {
		this(2016,11,30);
	}
	
	public MyDate(int year,int MM ,int dd) {
		this.year=year;
		this.MM=MM;
		this.dd=dd;
		String date = this.year+"-"+this.MM+"-"+this.dd;
		System.out.println(date);
		try {
			this.curDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public MyDate(int year,String MM ,int dd) {
		this.year=year;
		this.dd=dd;
		String date = this.year+"-"+this.MM+"-"+this.dd;
		System.out.println(date);
		try {
			this.curDate = sdf.parse(date);
			if(this.curDate .getMonth()<12)
				this.curDate .setMonth(this.curDate.getMonth()+1);
			else
				this.curDate .setYear(this.curDate.getYear()+1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public  MyDate(int year,int day ) {
		this.year=year;
		this.dd=day;
		String date = this.dd+","+this.year;
		System.out.println(date);
		try {
			sdf = new SimpleDateFormat(format4[1]);
			this.curDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
	}
	
	public void printDate(){
		SimpleDateFormat sdf = new SimpleDateFormat(format1[0]);
		String date = sdf.format(this.curDate);
		System.out.println(format1[0]+" "+date);
		
		sdf = new SimpleDateFormat(format2[1]);
		date = sdf.format(this.curDate);
		System.out.println(format2[0]+" "+date);
		
		sdf = new SimpleDateFormat(format3[1]);
		date = sdf.format(this.curDate);
		System.out.println(format3[0]+" "+date);
		
		sdf = new SimpleDateFormat(format4[1]);
		date = sdf.format(this.curDate);
		System.out.println(format4[0]+" "+date);
	}
	 

	
	
	public static int fnInputFirst() {
		String[] string = {"Enter 1 format:MM/DD/YYYY","Enter 2 format:Month DD,YYYY","Enter 3 format:DDD YYYY","Enter 4 to exit;"};
		for(int i=0 ;i<string.length;i++){
			System.out.println(string[i]); 
		}
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		return choice;
	}
	
	public static String fnInputString() {
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}
	
	public static int fnInputCommon() {
		int choice = 0  ;
		try {
			choice = Integer.parseInt(fnInputString());
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("error:"+e.getMessage());
		}
		return choice;
	}
	
	public static int fnChoice(int choice){
		int year;
		int month;
		int day;
		String string;
		MyDate myDate ;
		switch (choice) {
		case 1:
			System.out.println("Enter Month(1-12):");
			month = fnInputCommon();
			System.out.println("Enter Day of Month:");
			day = fnInputCommon();
			System.out.println("Enter Year:");
			year = fnInputCommon();
			myDate  = new MyDate(year,month,day);
			myDate.printDate();
			break;
		case 2:
			System.out.println("Enter a string:");
			string = fnInputString();
			System.out.println("Enter Day of Month:");
			day = fnInputCommon();
			System.out.println("Enter Year:");
			year = fnInputCommon();
			myDate  = new MyDate(year,string,day);
			myDate.printDate();
			break;
		case 3:
			System.out.println("Enter Day of Year:");
			day = fnInputCommon();
			System.out.println("Enter Year:");
			year = fnInputCommon();
			myDate  = new MyDate(year,day);
			myDate.printDate();
			break;
		case 4:
			System.out.println("exit;"); 
			break;
		default:
			System.out.println("your choice is inCorrect;");
			break;
		}
		return choice;
	}
	
	
	public static void main(String[] args) {
		//test for Extra Credit Quesetion 1 
		int firstValue = fnInputFirst();
		fnChoice(firstValue);
		//test(args);
		
	}
	

	
	 


}
