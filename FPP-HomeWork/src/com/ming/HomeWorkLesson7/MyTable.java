package com.ming.HomeWorkLesson7;


/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 8,2016
 * 
 * @description: Solution for com.ming.HomeWorkLesson7 Question 2
 * 
 */
public class MyTable {
	private final static  int letter = 97;
	
	private Entry entries = new Entry();

	// returns the String that is matched with char c in the table
	public String get(char c) {//65,A; 97,a;
		// implement
		if (c-letter<0 || c-letter>26 ) {
			System.out.println("this char:"+c+" is not a - z");
			return "";
		}
		return entries.keys[c-letter];
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		if (c-letter<0 || c-letter>26 ) {
			System.out.println("this char:"+c+" is not a - z");
			return ;
		}
		entries.keys[c-letter] = s;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	//Entry and MyTable should also each implement a toString() method The toString method in Entry should join the contents of its character and String variables with an arrow, as in the following: 
	
	public String toString() {
		// implement
		//String[] string = entries[0].toString().split(";");
		//System.out.println(Arrays.toString(string));
		return entries.toString();
	}

	private static class Entry {
		
		public static String[] keys = new String[26];
		
		Entry() {
			
		}
		
		// returns a String of the form "ch->str"
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<keys.length;i++){
				char c = (char)(i+letter) ;
				if (keys[i] == null) continue;
					String temp = c + ">"+keys[i];
					sb.append(temp);
					if (i!=keys.length-1)
						sb.append(";");
				
				//System.out.println(temp);
			}
			return sb.toString();
		}
	}
	
	
	public static void main(String arg[]){
		MyTable t = new MyTable(); 
		t.add('a', "Andrew"); 
		t.add('b',"Billy");
		t.add('l',"Little");
		t.add('w',"Willie");
		t.add('z',"Ziee");
		t.add('a', "Andrew1");
		System.out.println(t); 
	}
	

}
