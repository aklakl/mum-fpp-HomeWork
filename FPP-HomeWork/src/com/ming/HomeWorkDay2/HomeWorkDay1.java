package com.ming.HomeWorkDay2;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Nov 29,2016
 * 
 */
public class HomeWorkDay1 {

	
	public static void main(String arg[]){
		
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
	
	/**
	 * Quarters，Dimes， Nickels，Pennies 就是美元中的25美分，一美分，一镍( 五分镍币，五分钱)，便士。。就是会找钱找四种硬币
	 * @param amount
	 */
	//Question1 
	public static void getAmount(double amount){
		System.out.println("Your amount "+amount+" consists of");
        double dollar = (int)amount / 1;
        double decimal = amount - dollar;
        int quarter = (int) (decimal * 100 )/ 25;
        int Q_i = (int)(amount % 25);
        int Q_f = (int) (amount - (Q_i * 25));
        int Dimes = (int)(Q_f % 10)>=0 ? (Q_f % 10) :0  ;
        int D_f = (int) (amount - (Dimes * 10));
        int Nickels = (int)(D_f % 5);
        int Pennyies = (int)( (decimal*100)-(((int)(decimal*10))*10)) ;
        System.out.println(dollar +" Dollars " );
        System.out.println(quarter + " Quarters ");
        System.out.println(Dimes + " Dimes" );
        System.out.println(Nickels + " Nickels ");
        System.out.println(Pennyies +" Pennyies ");               
	}

	//Question2
	public static boolean  isLeapYear(int year){
		boolean result = false;
		System.out.println("This program is leap year.");  
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		if (isLeapYear)
		{
			System.out.println(year + " is a leap year.");
			result = true;
		} else {
			System.out.println(year + " is not a leap year.");
			result = false;
		}
		return result;
	}

	//Question3
	public static String generUserName(String userName){
		System.out.println("This program is generUserName.");
		//String[] userNameArray = new String[2];
		String[] userNameArray = userName.split(",|\\.| ");
		String firtName = userNameArray[0];
		String lastName = userNameArray[1];
		if (firtName.length()>5)
			firtName = firtName.substring(0, 5);
		if (lastName.length()>5)
			lastName = lastName.substring(0, 5);
		double random = Math.random();
		System.out.println(random);
		userName = firtName + lastName + getRandom() ;
		System.out.println("generUserName:"+userName);
		return userName;
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
