package com.ming.HomeWorkLesson4;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 2,2016
 * 
 * @description:    Solution for Quesetion 2 
 *
 */

public class RecursionMinimum {

	public RecursionMinimum() {
		 
	}
	
	/*
2. Using recursion to find the minimum character in a given string input.
If your input is “akel” in return ‘a’
	 */
	public static char getRecursionMinimum(String target){
		if (target.length()==1){
			return  target.charAt(0);
		}
		if (target.charAt(0) < target.charAt(1)){
			return getRecursionMinimum(target.substring(0, 1) + target.substring(2));
		}else{
			return getRecursionMinimum(target.substring(2));
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "akel";
		string = "Move disk 1 from A to C";
		char minimum = getRecursionMinimum(string);
		System.out.println("The string: \""+string+"\" has minimum value is "+minimum);
	}

}
