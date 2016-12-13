package com.ming.HomeWorkLesson8Day1;

import java.util.Arrays;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 12,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson8Day1 Quesetion 1
 *
 */
public class MyIntegerArray {
	
	private final int INITIAL_LENGTH = 5;
	
	private Integer[] intArray; 
	
	private int size;
	
	public MyIntegerArray() {
		intArray = new Integer[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Integer i ){
		if(size == intArray.length) resize();
		intArray[size++] = i;
	}
	
	public Integer get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return intArray[i];
	}
	
	public void removeDuplicate(){	//Integer[] intArray
		Integer[] newArray = new Integer[intArray.length];
		int index = 0;
		for(Integer test : intArray){
			boolean flag = false;
			for(int i = 0;i<newArray.length;i++){
				if (newArray[i] == test){
					flag = true;
					continue;
				}
			}
			if (!flag){
				newArray[index++]=test;
			}
		}
		intArray = newArray;
		size = index;
	}
	
	public boolean removeAll(){
		try{
			// clear to let GC do its work
	        for (int i = 0; i < size; i++)
	        	intArray[i] = null;
		}catch(Exception e){
			return false;
		}
        size = 0;
		return true;
	}
	
	/*
    private boolean batchRemove(Collection<?> c, boolean complement) {
        final Object[] elementData = this.elementData;
        int r = 0, w = 0;
        boolean modified = false;
        try {
            for (; r < size; r++)
                if (c.contains(elementData[r]) == complement)
                    elementData[w++] = elementData[r];
        } finally {
            // Preserve behavioral compatibility with AbstractCollection,
            // even if c.contains() throws.
            if (r != size) {
                System.arraycopy(elementData, r,
                                 elementData, w,
                                 size - r);
                w += size - r;
            }
            if (w != size) {
                // clear to let GC do its work
                for (int i = w; i < size; i++)
                    elementData[i] = null;
                modCount += size - w;
                size = w;
                modified = true;
            }
        }
        return modified;
    }
    
    */
	
	public boolean find(Integer i){
		for(Integer test : intArray){
			if(test.equals(i)) return true;
		}
		return false;
	}
	
	
	public Integer[] getSubList(int start,int end){
		Integer[] result = new Integer[end-start+1] ;
		if (start>end || start<0 || end<0) return result;
		if (end>this.intArray.length) end = this.intArray.length;
		System.arraycopy(this.intArray, start, result, 0, end-start+1);
		return result;
	}
	
	public boolean remove(Integer ip){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(intArray[i].equals(ip)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Integer[] temp = new Integer[intArray.length];
		System.arraycopy(intArray,0,temp,0,index);
		System.arraycopy(intArray,index+1,temp,index,intArray.length-(index+1));
		intArray = temp;
		--size;
		return true;
	}
	
	//resize
	private void resize(){
		System.out.println("MyIntegerArray resizing");
		int len = intArray.length;
		int newlen = 2*len;
		Integer[] temp = new Integer[newlen];
		System.arraycopy(intArray,0,temp,0,len);
		intArray = temp;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size; ++i){
			sb.append(intArray[i]);
			if (i !=size -1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public int size() {
		return size;
	}
	
	public static int getRandom(int start,int end) {
        int number = 0;
        int seed = end*10;
        while (true) {
            number = (int) (Math.random() * seed);
            if (number >= start && number <= end) {
                break;
            }
        }
        return number;
    }	


	public static void main(String[] args) {
		//test for MyIntegerArray instance    a) Insert 50 random numbers. // Random values in the  Range of 0 -100 
		MyIntegerArray myIntegerArray = new MyIntegerArray();
		for(int i= 0 ; i<50;i++){
			int iRandom = getRandom(0,100);
			myIntegerArray.add(iRandom);
		}
		System.out.println("The My Integer Array of size "+myIntegerArray.size()+" is "+myIntegerArray);
		
		
		//test for b) Remove duplicate from the array
		myIntegerArray.removeDuplicate();
		System.out.println("after Remove Duplicate The Array of size "+myIntegerArray.size()+" is "+myIntegerArray);
		
		
		//test for d) Find the size of the array. 
		System.out.println("The Array of size "+myIntegerArray.size()+" is "+myIntegerArray);

		
		//test for e) get the value by passing index. 
		int i = myIntegerArray.get(10);
		System.out.println(" get the value by passing 10 index : "+i+" is "+myIntegerArray);
	
		
		//test for f) get the sublist by passing start and end index
		Integer[] ia = myIntegerArray.getSubList(1,10);
		System.out.println(" get the sublist by passing 1 to 10 : "+ia.length+" is "+Arrays.toString(ia));
		
		
		//test for c) Remove all the elements from the array
		myIntegerArray.removeAll();
		System.out.println("after remove All The Array of size "+myIntegerArray.size()+" is "+myIntegerArray);
		
	}
}
