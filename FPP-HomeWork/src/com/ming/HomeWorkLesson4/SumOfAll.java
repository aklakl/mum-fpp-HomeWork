package com.ming.HomeWorkLesson4;

import java.util.Arrays;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 2,2016
 * 
 * @description:    Solution for Quesetion 4 
 *
 */
public class SumOfAll {

	public SumOfAll() {
		
	}

	//. Find the sum of all items in an array.
	public static long findSumOfAll(long[] target ) {
		if (target.length==1)
			return target[0];
		long[] transportItem = new long[target.length-1];
		transportItem  = Arrays.copyOfRange(target, 1, target.length);
		return target[0]+findSumOfAll(transportItem);
	}
	
	
	public static void main(String[] args) {
		long[] target = {1,2,3,5,7,8,12,43123,123,66,9089,};
		long result = findSumOfAll(target);
		System.out.println("the sum of the "+Arrays.toString(target)+" is "+result);

	}
	
	

}
