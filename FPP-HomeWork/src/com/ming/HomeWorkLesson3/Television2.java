package com.ming.HomeWorkLesson3;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Nov 30,2016
 * 
 * @description:    Solution for Quesetion 5 
 * 
 */

public class Television2 {

	public Television2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//test for question 1
		double amount = 11.56;
		getAmount(amount);
		
		//test for question 2
		int year = 2001;
		isLeapYear(year);
		
		//test for question 3
		String userName = "Ming Li";
		userName = "ABCDEFG higklmn";
		generUserName(userName);
	}
	
	
	 
	
	 
	
	
	public static int getRandom() {
        int number = 0;
        while (true) {
            number = (int) (Math.random() * 1000);
            if (number >= 100 && number < 1000) {
                break;
            }
        }
        return number;
    }


}
