package com.ming.HomeWorkLesson3;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Nov 30,2016
 * 
 * @description:    Solution for Quesetion 2 
 * 
 */

class PairOfDice {  
	public int die1; // Number showing on the first die.  
	public int die2; // Number showing on the second die. 
	
	public int totalDie;
	
	public PairOfDice() {   
		// Constructor. Rolls the dice, so that they initially   
		
		// show some random values. Call the roll() method to roll the dice. 
		this.roll();
		
	} 
	public PairOfDice(int val1, int val2) {   
		// Constructor. Creates a pair of dice that   
		
		// are initially showing the values val1 and val2.  
		this.die1 = val1;
		this.die2 = val2;
		
	} 
	public void roll() {   
		// Roll the dice by setting each of the dice (die1, die2) to be   
		
		// a random number between 1 and 6. 
		
		this.die1 = getRandom16();
		this.die2 = getRandom16();
		System.out.println("die1 : "+this.die1+"|die2 : "+this.die2);
		this.totalDie = this.die1+this.die2;
		
		
	} 
	
	
	public static int getRandom16() {
        int number = 0;
        while (true) {
        	java.util.Random random=new java.util.Random();// å®šä¹‰éš�æœºç±»
        	number = random.nextInt(7);// è¿”å›ž[0,10)é›†å�ˆä¸­çš„æ•´æ•°ï¼Œæ³¨æ„�ä¸�åŒ…æ‹¬10
            //number = (int) (Math.random() * 10);
            if (number >= 1 && number < 6) {
                break;
            }
        }
        return number;
    }
	
	public static void main(String[] args) {
		// Create two object for the PairOfDice 
		
		// Roll the two pairs of dice for both objects until the totals are same.  
		
		// Display how many times needed to get the same total 
		PairOfDice pair1 = new PairOfDice();
		PairOfDice pair2 = new PairOfDice();
		System.out.println("First pair come up with total    : "+pair1.totalDie);
		System.out.println("Second pair come up with total   : "+pair2.totalDie);
		int i = 1;
		while (pair1.totalDie != pair2.totalDie){
			i++;
			pair1.roll();
			System.out.println("First pair come up with total    : "+pair1.totalDie);
			pair2.roll();
			System.out.println("Second pair come up with total   : "+pair2.totalDie);
		}
		System.out.println("It took "+i+" times to reach the same value.");
		 
		
	}
	
	
} 

		
		
		
