package com.ming.HomeWorkLesson4;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 2,2016
 * 
 * @description:    Solution for Quesetion 5 
 *
 */
public class Palindrome {

	public Palindrome() {
		 
	}
	
	public static String reverseString(String target){
		if (target.length()==0) return "";
		return  reverseString(target.substring(1))+target.substring(0,1);
	}
	
	public static boolean checkPalindrome(String target){
		String temp = reverseString(target);
		System.out.println("target:"+target+"    |reverseString:"+temp);
		if (target.equals(temp)){
			System.out.println("Check the given string input is palindrome String");
			return true;
		}else{
			System.out.println("Check the given string input is not a palindrome String");
			return false;
		}	
	}
	
	public static void main(String[] args) {
		//test for Palindrome
		String target = "aba";
		checkPalindrome(target);
		
		System.out.println("===================");
		
		//test for not Palindrome
		target = "abcdefghijk";
		checkPalindrome(target);
		
		
	}

}
