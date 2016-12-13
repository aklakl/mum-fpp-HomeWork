package com.ming.HomeWorkLesson8Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 12,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson8Day1 Quesetion 2 
 *
 */
public class MarketingList  {
	
	private ArrayList<Marketing> marketList;

	public MarketingList(){
		marketList = new ArrayList<Marketing>();
	}
	
	public int getSize(){
		return marketList.size();
	}
 
	public boolean add(Marketing m) {
		return marketList.add(m);
	}
	
	public boolean remove(Marketing m){
		return  marketList.remove(m);
	}
	
	public Marketing set(int index,Marketing element){
		return  marketList.set(index, element);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		int i = 0;
		for (Marketing m :marketList){
			sb.append("{");
			sb.append("Employeename");
			sb.append(":");
			sb.append(m.getEmployeename());
			sb.append(",");
			
			sb.append("Productname");
			sb.append(":");
			sb.append(m.getProductname());
			sb.append(",");
			
			sb.append("Salesamount");
			sb.append(":");
			sb.append(m.getSalesamount());
			sb.append("}");
			if (i != marketList.size())
				sb.append(",");
			i++;
		}
		sb.append("]");
		System.out.println("sb.toString():"+sb.toString());
		return sb.toString();
	}
	
	//sort according to the employeename and salesamount
	public static final Comparator NAMEAMOUNT = new Comparator(){
		public int compare(Object o1, Object o2){
			String name1 = ((Marketing)o1).getEmployeename() ;
			String name2 = ((Marketing)o2).getEmployeename();
			
			Integer amount1 = ((Marketing)o1).getSalesamount();
			Integer amount2 = ((Marketing)o2).getSalesamount();
			int result  = name1.compareTo(name2) + amount1.compareTo(amount2);
			System.out.println(" Comparator is  " + NAMEAMOUNT.getClass()+" "+result);
			return result;
		}
	};
	
	public void customSort(){
		Collections.sort(marketList, MarketingList.NAMEAMOUNT);
	}
	
	
	/*
2. Create a class called Marketing with fields of employeename, productname, and salesamount. Create an Arraylist for the class Marketing. Implement the following methods in the main class. (Pre-Defined Usage of ArrayList class) 
a. add() // adding objects to the Marketing 
b. remove() // delete objects from Marketing  
c. set() // Modify some objects using set() method 
d. sort according to the employeename and salesamount using comparator interface 
e. Override toString() method to display the contents in the list. 
f. Get the size of the list. 
	 */	
	public static void main(String[] args) {
		//2. Create a class called Marketing with fields of employeename, productname, and salesamount. Create an Arraylist for the class Marketing. Implement the following methods in the main class. (Pre-Defined Usage of ArrayList class) 
		MarketingList marketingList = new MarketingList();
		Marketing marketing1 = new Marketing("Ming Li", "testproduct1", 11);
		Marketing marketing2 = new Marketing("Qiang Wang", "testproduct2", 12);
		Marketing marketing3 = new Marketing("Dong Wang", "testproduct3", 13);
		
		
		//test for a. add() // adding objects to the Marketing 
		marketingList.add(marketing1);
		marketingList.add(marketing2);
		marketingList.add(marketing3);
		System.out.println("marketingList size is "+marketingList.getSize()+" marketingList.toString is "+marketingList.toString());
		
		
		//test for b. remove() // delete objects from Marketing
		marketingList.remove(marketing1);
		System.out.println("after remove marketingList size is "+marketingList.getSize()+" marketingList.toString is "+marketingList.toString());

		
		//test for c. set() // Modify some objects using set() method 
		Marketing marketing4 = new Marketing("Andy Lee", "testproduct4", 14);
		marketingList.set(3, marketing4);
		System.out.println("after set marketingList size is "+marketingList.getSize()+" marketingList.toString is "+marketingList.toString());

		
		//test for d. sort according to the employeename and salesamount using comparator interface 
		marketingList.customSort();
		System.out.println("after customSort marketingList size is "+marketingList.getSize()+" marketingList.toString is "+marketingList.toString());

		
		//test for e. Override toString() method to display the contents in the list. 
		System.out.println("print for e. Override toString() "+marketingList.toString());

		
		//test for f. Get the size of the list. 
		System.out.println("print for f. Get the size of the list ："+marketingList.getSize());

		
 	}
	


}
