package com.ming.HomeWorkLesson4;

import java.util.Arrays;

/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 3,2016
 * 
 * @description: Solution for Quesetion 3
 *
 */
public class BinarySearch {

	public BinarySearch() {

	}

	// 3. Perform Recursive Binary Search.
	public static long recursiveBinarySearch(long[] arr, long key, int low, int high) {
		System.out.println("arr:"+arr.length);
		int mid;
		if (high < low) {
			return -1;
		}
		mid = (low + high) / 2;
		if (arr[mid] < key)
			return recursiveBinarySearch(arr, key, mid + 1, high);
		else if (arr[mid] > key)
			return recursiveBinarySearch(arr, key, low, mid - 1);
		else
			return mid;
	}

	public static void main(String[] args) {
		long[] target = { 1, 2, 3, 5, 6, 7, 8, 9, 123, 556, 779, 880, 991, 1011 };
		long key = 991;
		long result = recursiveBinarySearch(target,key,0,target.length-1);
		System.out.println(" recursiveBinarySearch " + Arrays.toString(target) + "|key="+key);
		if (result > -1) {
			System.out.println("Item found on location: " + result);
		} else {
			System.out.println("Item not found");
		}
	}


}
