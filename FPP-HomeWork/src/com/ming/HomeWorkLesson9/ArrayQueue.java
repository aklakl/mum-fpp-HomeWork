package com.ming.HomeWorkLesson9;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 14,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson9 Quesetion 1 
 *
 */
interface Queue{
	public boolean add(Object o );
	public boolean remove();
	public String peek();
	public boolean isEmpty();
	public int size();
}

public class ArrayQueue implements Queue{
	
	private final int INITIAL_LENGTH = 100;
	
	private Object[] array; 
	
	private int size;
	
	private int front = 0 ;
	
	private int rear = 0 ;
	//FIFO
	public ArrayQueue(int maxSize) {
		if (maxSize <1)
			maxSize = INITIAL_LENGTH;
		this.array = new Object[maxSize];
		size = 0;
	}
	
	//a. add() b. remove() c. peek() d. size() e. isEmpty() f. Override the toString() method to display all items in the Queue
	//implement a. add()
	public boolean add(Object o ) {
		if (isFull()){
			System.out.println("the Queue is full");
			return false;
		}
		if (rear == this.array.length && !isFull() ) {
			rear = 0;
		}
		this.array[rear] = o;
		size++;
		rear++;
		return true;
	}
	
	//implement b. remove()
	public boolean remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return false;
		}
		if (front == this.array.length ) {
			front = 0 ;
		}
		array[front] = null;
		front++;
		size--;
		return true;
	}
	
	//implement c. peek()
	public String peek() {//get the Top Element
		if (front == this.array.length ) {
			front = 0 ;
		}
		return this.array[front].toString();
	}
	
	
	//implement d. size()
	public int size() {
		return this.size;
	}
	
	
	//implement e. isEmpty()
	public boolean isEmpty() {
		if (this.size == 0){
			return true;
		}else{
			return false;
		}
	}
	
	//implement f. Override the toString() method to display all items in the Queue
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for(int i = 0; i <this.array.length;i++){
			sb.append(array[i]);
			if (i != this.array.length-1)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public boolean isFull() {
		if (this.size == this.array.length){
			return true;
		}else{
			return false;
		}
	}
	
	//test for the soultion
	public static void main(String[] args) {
		//test for a. add() 
		ArrayQueue queue = new ArrayQueue(5);
		queue.add("test1");
		queue.add("test2");
		queue.add("test3");
		queue.add("test4");
		queue.add("test5");
		queue.add("test6");
		System.out.println("after ArrayQueue add 5 element print :"+queue);
		
		//test for b. remove() 
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println("after ArrayQueue remove 5 element print :"+queue);
		
		
		//test for c. peek()
		queue.add("element1");
		queue.add("element2");
		queue.add("element3");
		queue.remove();
		queue.remove();
		queue.add("element4");
		queue.add("element5");
		queue.add("element6");
		queue.add("element7");
		System.out.println(" ArrayQueue peek()  print :"+queue.peek());
		
		
		//test for d. size()
		System.out.println(" ArrayQueue isEmpty()  print :"+queue.size());
		
		
		//test for  e. isEmpty()
		System.out.println(" ArrayQueue isEmpty()  print :"+queue.isEmpty());
		
		 
		//test for f. Override the toString() method to display all items in the Queue
		System.out.println(" ArrayQueue peek()  print :"+queue.toString());
		
		
		
	}

}
