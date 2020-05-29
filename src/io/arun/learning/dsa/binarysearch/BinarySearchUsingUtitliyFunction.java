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
public class BinarySearchUsingUtitliyFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		long[] arr = new long[n];
		System.out.println("Enter the array elements one by one:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		System.out.println("Enter the element to be searched:");
		long search = sc.nextLong();
		int loc = Arrays.binarySearch(arr, search);
		if(loc < 0) {
			System.out.println("Element could not be found");
		}else {
			System.out.println("Element found at location "+loc);
		}
	}

}
