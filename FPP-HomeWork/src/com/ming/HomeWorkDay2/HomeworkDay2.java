package com.ming.HomeWorkDay2;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * @author Ming Li
 * @Student No  985579
 * @date Nov 29 ,2016
 */
public class HomeworkDay2 {
	
	public HomeworkDay2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		//test for question 1
		System.out.println("");
		System.out.println("===========test for question 1===========");
		getPalindrome(); 
		
		 
		//test for question 2
		System.out.println("");
		System.out.println("===========test for question 2===========");
		String[] string = {"horse", "dog", "cat", "horse","dog"};
		removeDups(string);
		
		
		//test for question 3
		System.out.println("");
		System.out.println("===========test for question 3===========");
		int choice =1;
		int lbs = 10;
		getWeight(choice,lbs);
		

		//test for question 4
		System.out.println("");
		System.out.println("===========test for question 4===========");
		countString();
		 
		//test for question 5
		System.out.println("");
		System.out.println("===========test for question 5===========");
		String key = "DBDCCDAEAD";
		char[] keyArray = key.toCharArray();
		char[][] student = new char[8][10];
		String studentAnswer = "ABACCDEEAD,DBABCAEEAD,EDDACBEEAD,CBAEDCEEAD,ABDCCDEEAD,BBECCDEEAD,BBACCDEEAD,EBECCDEEAD";
		String[] saArray = studentAnswer.split(",");
		for(int i = 0;i<student.length;i++){
			for (int k = 0; k < saArray[i].length(); k++) {
				student[i][k]=	saArray[i].charAt(k);
			}
		}
		compareAnswer(keyArray,student);
		 
		
	}
	
 
	//Solution for Quesetion 1 
	public static String getPalindrome() {
		String input ;
		System.out.println("please input a palindrome digit (five digit),until input enter is finish. ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();
		
		if (input.length() !=5) {
			System.out.println("error your input length is not five digit,please input again");
			input = getPalindrome();
		}
		boolean loop = true;
		for (int i = 0; i < input.length(); i++) {
			int digit = input.charAt(i);
			if (digit < 0 && digit > 9 ){
				loop = false;
			}
		}
	  	if (!loop) {
	  		input = getPalindrome();
	  	}
	  	//System.out.println("end");
	  	return input;
	}
 
 
	//Solution for Quesetion 2 
	public static String[] removeDups(String[] args) {
		int removeCount = 0 ;
	
		for (int i = 0 ;i<args.length;i++){
			for (int j = i+1; j < args.length; j++) {
				if (args[i].equals(args[j])){
					args[j]="";
					if (!args[i].equals("") ){
						removeCount++;
					}
				}
			}
		}
		int index = 0;
		String[] result = new String[args.length-removeCount] ;
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals("")){
				result[index]=args[i];
				index++;
			}
			
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	
	
	
	//Solution for Quesetion 3 
	public static double getWeight(int choice,int lbs) {
		double  weight = 0 ;
		switch (choice) {
		case 1:
			weight = lbs* 0.78;
			System.out.println("your choice 1 Venus 0.78,the weight is "+weight);
			break;
		case 2:
			weight = lbs* 0.39;
			System.out.println("your choice 2 Mars 0.39,the weight is "+weight);
			break;
		case 3:
			weight = lbs* 2.65;
			System.out.println("your choice 3 Jupiter 2.65,the weight is "+weight);
			break;
		case 4:
			weight = lbs* 1.17;
			System.out.println("your choice 4 Saturn 1.17,the weight is "+weight);
			break;
		case 5:
			weight = lbs* 1.05;
			System.out.println("your choice 5 Uranus 1.05,the weight is "+weight);
			break;	
		case 6:
			weight = lbs* 1.05;
			System.out.println("your choice 6 Neptune 1.23,the weight is "+weight);
			break;		
		default:
			System.out.println("your choice is inCorrect");
			break;
		}
		return weight;
	}
	
	//Solution for Quesetion 4 
	public static void countString( ) {
		System.out.println("please input a string ,until input enter is finish. ");
		Scanner scanner=new Scanner(System.in);
	   	//double a=scanner.nextDouble();
	   	String args =scanner.next(); 
	  	System.out.println(args);
		
		int countA = 0;
		for (int i = 0; i < args.length(); i++) {
			if (args.charAt(i) == 'A') countA++;
		}
		System.out.println("you input the string length is "+args.length());
		System.out.println("you input the string starts with ‘A’ count is "+countA);
	}	
	
	
	
	//Solution for Quesetion 5 
	public static void compareAnswer(char[] key,char[][] student) {
		for (int i = 0; i < student.length; i++) {
			int count = 0;
			for (int j = 0; j < key.length; j++) {
				if (student[i][j]==key[j])  count++;
			}
			System.out.println("student "+i+"'s correct count is "+count);
		}
	}
	
}
