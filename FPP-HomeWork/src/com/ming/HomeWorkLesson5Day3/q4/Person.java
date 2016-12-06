package com.ming.HomeWorkLesson5Day3.q4;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 5,2016
 * 
 * @description:   Solution for com.ming.HomeWorkLesson5Day3 Quesetion 3 
 *
 */
import com.ming.HomeWorkLesson5Day3.q3.Computer;


class Person implements Cloneable {

	String name;           
	Computer computer; // Refer from the Problem 3. 

 	public Object shadowClone() throws CloneNotSupportedException {
 		Person clone = (Person)super.clone();
	    return clone;
	}
 	
 	public Object deepClone() throws CloneNotSupportedException {
 		Person clone = (Person)super.clone();
 		//Need to clone the Address reference variable too
 		clone.computer = (Computer)this.computer.clone();
	    return clone;
	}
	
	public Person(String name, Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	public String toString(){
		return this.name+" "+this.computer.toString();
	}
	
	//a. Apply clone() method and write the implementation to understand the concepts of shallow and deep copy. 
	public static void main(String[] args) {
		Computer computer1 = new Computer("computer1", "processor", 128, 1024, 24);
		Computer computer2 = new Computer("IBM", "intel", 128, 1024, 24);
		Person person1 = new Person("Jonh",computer1);
		Person person2 = new Person("Ming",computer2);
		Person person11 = null ,person22 = null;
		try {
			person11 = (Person)person1.shadowClone();
			person22 = (Person)person2.deepClone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("person11 shadowClone person1:");
		System.out.println("person22 deepClone: person2:");
		System.out.println("person1:"+person1.toString());
		System.out.println("person2:"+person2.toString());
		System.out.println("person11:"+person11.toString());
		System.out.println("person22:"+person22.toString());
		System.out.println("===============================");
		System.out.println("modify person1.computer.Manufacturer and modify person2.computer.Manufacturer");
		person1.computer.setManufacturer(person1.computer.getManufacturer()+ " changed flag" );
		person2.computer.setManufacturer(person2.computer.getManufacturer()+ " changed flag" );
		System.out.println("person1:"+person1.toString());
		System.out.println("person2:"+person2.toString());
		System.out.println("person11:"+person11.toString());
		System.out.println("person22:"+person22.toString());
		
	}
	
	
}
