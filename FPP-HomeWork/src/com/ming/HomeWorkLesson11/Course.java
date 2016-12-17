package com.ming.HomeWorkLesson11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 16,2016
 * 
 * @description: Solution for com.ming.HomeWorkLesson11 Quesetion 1
 *
 */
public class Course {
	
	String c_name; 
	
	String[] faculty; 
	
	public Course(String c_name, String[] faculty) {
		super();
		this.c_name = c_name;
		this.faculty = faculty;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder("(");
		sb.append(this.c_name+":{");
		for(int i = 0;i<this.faculty.length;i++){
			sb.append(faculty[i]);
			if (i!= this.faculty.length -1)
				sb.append(",");
		}
		sb.append("})");
		return sb.toString();
	}
	
	
	/*

a. Make a constructor to initialize values 
b. Create getter and setter for the mentioned fields 
c. Create HashMap<String, Course> for the Course class. (Pre-defined class) a. Mention Course_id as a Key for your hashmap. Example in your HashMap entry - (“CS390” ,(“FPP”, {“Renuka”, “Joe Lermon”, “Paul”}) 
d. Put the key and values in the HashMap. 
e. Check the given course_id is in the list or not
f. Retrieve values using Keys 
g. Display the how many faculties are handling each course. Example output – [ FPP – 3 Faculties ] 
h. Display all the values in HashMap Collection. 
i. Find the size 
 
	 */
	public static void main(String[] args) {
		//HashMap entry - (“CS390” ,(“FPP”, {“Renuka”, “Joe Lermon”, “Paul”}))
		String course_id = "CS390";
		
		String[] faculty =  {"Renuka", "Joe Lermon", "Paul"};
		//test for a. Make a constructor to initialize values 
		Course course = new Course("", null);
		
		
		//test for b. Create getter and setter for the mentioned fields
		course.setC_name("FPP");
		course.setFaculty(faculty);
		
		
		//test for c. Create HashMap<String, Course> for the Course class. (Pre-defined class) a. Mention Course_id as a Key for your hashmap. Example in your HashMap entry - (“CS390” ,(“FPP”, {“Renuka”, “Joe Lermon”, “Paul”}) 
		HashMap<String, Course> hm = new HashMap<String, Course>();
		
		
		//test for d. Put the key and values in the HashMap.
		hm.put(course_id, course);
		
		
		//test for e. Check the given course_id is in the list or not
		System.out.println("print hm.containsKey(course_id =\"CS390\" ):"+hm.containsKey(course_id));
		
		
		//test for f. Retrieve values using Keys
		System.out.println("test for Retrieve values using Keys:"+hm.get(course_id).toString());
		
		
		//test for g. Display the how many faculties are handling each course. Example output – [ FPP – 3 Faculties ] 
		for (int i =1;i<=5; i++){
			String[] facultyNew = new String[faculty.length+1]; 
			System.arraycopy(faculty, 0, facultyNew, 0, faculty.length);
			facultyNew[facultyNew.length-1] = "faculty"+i;
			faculty = facultyNew;facultyNew = null;
			Course c = new Course("course"+i,faculty);
			hm.put("CS-course"+i,c );
		}
		System.out.println("test for Display the how many faculties are handling each course:");
		Iterator iterator = hm.entrySet().iterator();
		while(iterator.hasNext()){
			HashMap.Entry entry = (HashMap.Entry)iterator.next();
			Object key = entry.getKey();
			Course c = (Course)entry.getValue();
			System.out.println("[ "+c.getC_name()+" - "+c.getFaculty().length+" Faculties  ]");
		}
		
		
		//test for h. Display all the values in HashMap Collection. 
		System.out.println("test for Display all the values in HashMap Collection:"+hm.size());
		iterator = hm.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Map.Entry)iterator.next();
			Object key = entry.getKey();
			Course c = (Course)entry.getValue();
			System.out.println( c.toString());
		}
		
		
		//test for i. Find the size 
		System.out.println("test for Find the size :"+hm.size());
		
		
		
		
		
	}

}
