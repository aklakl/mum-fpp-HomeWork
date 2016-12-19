package com.ming.HomeWorkLesson11;

/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 16,2016
 * 
 * @description: Solution for com.ming.HomeWorkLesson11 Quesetion 2
 *
 */
//demonstrates hash table user defined implementation with linear probing
import java.io.*;
import java.util.Scanner;

class PersonItem {
	
	private String mail_id;  	//Person E_Mail-id-Key 
	
	private String name;  		// Name of the person } 

	/**
	 * @param mail_id
	 * @param name
	 */
	public PersonItem(String mail_id, String name) {
		super();
		this.mail_id = mail_id;
		this.name = name;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


 

class HashTable {
	private PersonItem[] hashArray; // array holds hash table
	private int arraySize;
	private PersonItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new PersonItem[arraySize];
		nonItem = null; // deleted item key is -1
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Index : " + j + " " + hashArray[j].getMail_id() + " " + hashArray[j].getName());
			else
				System.out.println("Index : " + j + " " + "**");
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public int hashFunc(String key) {
		return key.hashCode() % arraySize; // hash function
	}

	// -------------------------------------------------------------
	public void insert(String key, String v) // insert a DataItem
	// (assumes table not full)
	{
		// extract key
		int hashVal = hashFunc(key); // hash the key
										// until empty cell
		// an index have some data and not match with existing key, it find next
		// vacant position
		while (hashArray[hashVal] != null && !hashArray[hashVal].getMail_id().equals(key)  ) {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		PersonItem obj = new PersonItem(key, v);
		hashArray[hashVal] = obj; // insert item
	} // end insert()
		// -------------------------------------------------------------

	public PersonItem delete(String key) // delete a DataItem
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getMail_id().equals(key)) {
				PersonItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return temp; // return item
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
		// -------------------------------------------------------------

	public boolean find(String key) // find item with key
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getMail_id().equals(key))
				return true; // yes, return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return false; // can't find item
	}
	// -------------------------------------------------------------
} // end class HashTable
	////////////////////////////////////////////////////////////////

class HashTableApp {
	 
	/*
	public static void preTest(){
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);

		theHashTable.insert("1", "FPP");
		theHashTable.insert("5", "Java");
		theHashTable.insert("7", "SE");
		theHashTable.insert("10", "C#");

		while (true) // interact with user
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); // Read a Char from the console
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	}
	*/
	
	public static void preTestPerson(){
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);
		
		for(int i = 0 ; i<10 ; i++){
			theHashTable.insert("key"+i,"value"+i );	
		}
		
		while (true) // interact with user
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); // Read a Char from the console
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	}
	
	public static void main(String[] args) throws IOException {
		//preTest();
		preTestPerson();
		
		
		
	} // end main()
		// --------------------------------------------------------------
} // end class HashTableApp
	////////////////////////////////////////////////////////////////
