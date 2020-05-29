/**
 * 
 */
package io.arun.learning.dsa.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Arun Kumar
 *
 */
public class BinarySearchOptimalSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		System.out.println("Enter the array elements one by one:");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextLong();
		
		Arrays.sort(arr);
		
		System.out.println("Enter the element to be searched:");
		long search = sc.nextLong();
		
		int location = binarySearch(0, arr.length-1, arr, search);
		if(location == -1) 
			System.out.println("Element could not be found");
		else
			System.out.println("Element found at location : " + location);
		
	}
	
	public static int binarySearch(int low,int high,long[] arr,long search) {
		if(low == high) {
			if(arr[low]==search)
				return low;
			else 
				return -1;
		}else {
			int mid = (low + high) / 2;
			if(arr[mid] == search)
				return mid;
			else if(search > arr[mid])
				return binarySearch(mid+1,high,arr,search);
			else
				return binarySearch(low,mid-1,arr,search);
		}
	}

}
