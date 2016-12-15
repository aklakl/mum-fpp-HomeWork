package com.ming.HomeWorkLesson9;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 15,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson9 Quesetion 3 
 *
 */
class Registration {

	int regno; // Registration number 
	
	String cname; // Name of the Course  
	
	String sname;  // Name of the student  
	
	String sid; // Student id 

	// Create a constructor to initialize the values           } 
	public Registration(int regno, String cname, String sname, String sid) {
		super();
		this.regno = regno;
		this.cname = cname;
		this.sname = sname;
		this.sid = sid;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String toString(){
		return "cname="+this.cname+"|sname="+this.sname+"|sid="+this.sid+"|regno="+this.regno;
	}
	
}


public class PriorityQueueRegistration {
	//a) Create a Queue object for the class Registration. Give the priority using regno or sid. [ Use Comparator Interface] – Refer  - PriorityQueueSale(2).java b) Add five elements to the Queue.  c) Get the peek object and display the information. d) Get the size of the queue e) Display all the queue elements by invoking remove() method. f) Check the Queue isempty() or not. 

	//a) Create a Queue object for the class Registration. Give the priority using regno or sid. [ Use Comparator Interface] – Refer  - PriorityQueueSale(2).java 
	public static Comparator<Registration> regnoComparator = new Comparator<Registration>(){
        @Override
        public int compare(Registration r1, Registration r2) {
        	  	return (int) (r1.regno - r2.regno);
        }
    };
    
    public static Comparator<Registration> sidComparator = new Comparator<Registration>(){
        @Override
        public int compare(Registration r1, Registration r2) {
        	  	return  r1.sid.compareTo(r2.sid);
        }
    };
	
    
	public static void main(String args[]) {
		Queue<Registration> priorityQueue = new PriorityQueue<>(sidComparator);
		
		//test for b) Add five elements to the Queue.  
		for(int i= 0;i<5;i++){
			Registration r = new Registration(i, "cname"+i, "sname"+i, "sid"+i);
			priorityQueue.add(r);
		}
		
		
		//test for c) Get the peek object and display the information. 
		System.out.println("test for priorityQueue.peek():"+priorityQueue.peek());
		
		
		//test for d) Get the size of the queue 
		System.out.println("test for priorityQueue.size():"+priorityQueue.size());
		
		
		//test for e) Display all the queue elements by invoking remove() method. 
		System.out.println("Display all the queue elements by invoking remove() method ");
		int i = 1;
		while (priorityQueue.size() != 0 ){
			Registration r = new Registration(i, "cname"+i, "sname"+i, "sid"+i);
			System.out.println("priorityQueue "+i+":"+priorityQueue.peek());
			priorityQueue.remove();
			i++;
		}
		
		
		//test for f) Check the Queue isempty() or not. 
		System.out.println("Check the Queue isempty() or not:"+priorityQueue.isEmpty());
		
		
	}
	
}
