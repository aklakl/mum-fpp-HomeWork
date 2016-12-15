package com.ming.HomeWorkLesson9;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 14,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson9 Quesetion 2 
 *
 */
public class CheckPalindrome {

	public CheckPalindrome() {
		//
	}

	public String reverseByStack(String source){
		Stack stack = new Stack();
		for(int i = 0;i<source.length();i++){
			stack.push(source.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty()){
			Object o  = stack.pop();
			sb.append(o.toString());
		}
		return sb.toString();
	}
	
	public boolean checkPalindrome(String string){
		boolean result = false;
		String tempStr = reverseByStack(string);
		if (tempStr.equals(string)){
			result = true;
		}
		System.out.println("your input string is :"+string+"  | after reverseByStack :"+tempStr+"  | result :"+result);
		return result;
	}
	
	public static void main(String[] args) {
		//
		System.out.println("please given a input String, we check it is palindrome or not, using Java API java.util.Stack class.");
		Scanner in = new Scanner(System.in);
		String string = in.next();
		CheckPalindrome cp = new CheckPalindrome();
		cp.checkPalindrome(string);
		//System.out.println("your input string is :"+string+"    |result:"+result);
		
	}

}
