package com.ming.HomeWorkLesson8Day2;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 13,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson8Day2 Quesetion 1 
 *
 */
public class MyStringLinkedList {
	Node header;
	
	private int size;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
		size++;
	}

	// Implement the code
	public void addLast(String item) {
		Node lastNode = this.findLast();
		postAddNode(lastNode,item);
		//lastNode;
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		//System.out.println("postAddNode  Node:"+n.toString()+"|value:"+value);
		Node newNode = new Node(null,value,null);
		newNode.next = n.next;
		n.next = newNode;
		if (n.next !=null) {//deal with common node
			newNode.previous = n ;
		};
		/*
		if (n.next !=null) {//deal with common node
			newNode.next = n.next;
			n.next = newNode;
			newNode.previous = n ;
		}else{//deal with lastnode
			newNode.next = n.next;
			n.next = newNode;
		}
		*/
		size++;
	}

	// implement the code
	public int Size() {
		//findLast();
		return size;
	}

	// implement code
	public boolean isEmpty(){
		if  (this.header ==  null)
			return true;
		else
			return false;	
	}
	
	// implement code
	public Node getFirst() {
		return header;
	}
	
	// implement code
	public Node getLast() {
		int sizeNew = 0;
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null){
				//System.out.println("header:"+header+"|temp:"+temp);
				temp = temp.next;
				sizeNew++;
			}
			//System.out.println("findLast method cal sizeNew:"+sizeNew+"|size"+size);
			if (sizeNew != size){
				size = sizeNew;
			}
			return temp;
		}
	}
	
	// implement code
	public void removeFirst() {
		if (header != null){
			Node temp = header;
			temp.next.previous = null;
			header = temp.next;
			size--;
		}
	}
	
	// implement code
	public void removeLast() {
		Node n = getLast();
		this.deleteNode(n);
		size--;
	}
	
	// implement code
	public void print(Node n) {
		//test for public void print(Node n) {} //Write a recursive print method to display the elements in the list. Start with the First Node(Head) 
		if (n == null) return;
		if (n.next == null) {
			System.out.println(n.value);
			return ;
		}
		System.out.println(n.value);
		this.print(n.next);
	}
	
	
	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
			size++;
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
			size++;
		}
		
	}

	public Node findLast() {
		int sizeNew = 0;
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null){
				temp = temp.next;
				sizeNew++;
			}
			System.out.println("findLast method cal sizeNew:"+sizeNew+"|size"+size);
			if (sizeNew !=size){
				size = sizeNew;
			}
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}
			size--;
		}

	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
		size = 0;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	public class Node {
		String value;
		Node next;
		Node previous;
		String test;
		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}

	}

	
	public static void myTest() {
		MyStringLinkedList mySL = new MyStringLinkedList();
		MyStringLinkedList temp = mySL;
		mySL.addFront("Pen Pineapple Apple Pen");
		System.out.println("1 mySL: "+mySL+"|temp:"+temp);
		mySL.addFront("11111n");
		System.out.println("2 mySL: "+mySL+"|temp:"+temp);
		temp = null;
		System.out.println("3 mySL: "+mySL+"|temp:"+temp);
	}
	
	public static void main(String[] args) {
		//preTest();
		//myTest();
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println("test for MyStringLinkedList isEmpty print:"+mySL.isEmpty());
		mySL.addFront("Pen Pineapple Apple Pen");
		mySL.addFront("F");
		mySL.addFront("E");
		mySL.addFront("D");
		mySL.addFront("C");
		mySL.addFront("B");
		mySL.addFront("A");
		System.out.println("first print MyStringLinkedList: "+mySL);
		
		
		//test for  public void addLast(String item) { }
		mySL.addLast("addLast");
		mySL.addLast("Ming Li");
		System.out.println("test for addLast print: "+mySL);
		
		
		//test for public void postAddNode(Node n, String value){} 
		mySL.postAddNode(mySL.findItem("Pen Pineapple Apple Pen"),"postAddNode");
		System.out.println("test for postAddNode print: "+mySL);
		
		
		//test for public int size(){ } 
		System.out.println("MyStringLinkedList size is "+mySL.Size());
		
		
		//test for public boolean isEmpty(){}
		System.out.println("test for MyStringLinkedList isEmpty print:"+mySL.isEmpty());
		
		
		//test for public object getFirst(){}
		System.out.println("test for MyStringLinkedList getFirst print:"+mySL.getFirst());
		
		
		//test for public object getLast(){}
		System.out.println("test for MyStringLinkedList getLast print:"+mySL.getLast());
		
		
		//test for public void removeFirst(){}
		System.out.println("test for MyStringLinkedList before removeFirst print:"+mySL);
		mySL.removeFirst();
		System.out.println("test for MyStringLinkedList after  removeFirst print:"+mySL);
		
		
		//test for public void removeLast(){}
		System.out.println("before MyStringLinkedList removeLast print:"+mySL);
		mySL.removeLast();
		System.out.println( "after MyStringLinkedList removeLast print:"+mySL);
		
		
		//test for public void print(Node n) {} //Write a recursive print method to display the elements in the list. Start with the First Node(Head) 
		System.out.println("test for MyStringLinkedList print(Node n) print below");
		//mySL.print(mySL.findItem("Ming Li"));
		mySL.print(mySL.findItem("B"));
		
		
		
	}
	
	public static void preTest(){
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
	}

}
