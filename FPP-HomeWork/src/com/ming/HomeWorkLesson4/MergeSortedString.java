package com.ming.HomeWorkLesson4;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 2,2016
 * 
 * @description:    Solution for Quesetion 1 
 *
 */
public class MergeSortedString {

	public MergeSortedString() {
		
	}
	
	//20161205 modify a mistake
	public static String getMergeSortedString(String string1,String string2) {
		//System.out.println("string1:"+string1+"|string2:"+string2);
		if (string1.length() == 0 && string2.length() == 0 ){
			return "";
		}
		if (string1.length() == 0){
			return string2.substring(0, 1)+getMergeSortedString("",string2.substring(1));
		}
		if (string2.length() == 0){
			return string1.substring(0, 1)+getMergeSortedString(string1.substring(1),"");
		}
		if (string1.charAt(0) <= string2.charAt(0)){
			return string1.substring(0, 1)+getMergeSortedString(string1.substring(1),string2.substring(0));
		}else{
			return string2.substring(0, 1)+getMergeSortedString(string1.substring(0),string2.substring(1)); 
		}
	}
	
	
	
/*
Find the solutions for the given problem using recursive approach.
1. Merge the two sorted string into a single sorted string.
Example : String1 = “ ace ”
String2 = “ bdf ”
Output : “ abcdef ”
*/

	public static void main(String[] args) {
		String string1 = "abf";
		String string2 = "cde";
		String result = getMergeSortedString(string1,string2);
		System.out.println(result);
	}

}
