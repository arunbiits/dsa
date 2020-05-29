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
public class BinarySearchNormalSolution {

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
		int low = 0, high = arr.length;
		int mid = (low+high)/2;
		boolean isFound = false;
		if(arr[mid] == search) {
			isFound = true;
			System.out.println("Element found at location : "+mid);
		}else if(search > arr[mid]) {
			for(int i=mid+1;i<high-1;i++) {
				if(arr[i] == search) {
					isFound = true;
					System.out.println("Element found at location : "+i);
					break;
				}
			}
		}else {
			for(int i=low;i<mid-1;i++) {
				if(arr[i] == search) {
					isFound = true;
					System.out.println("Element found at location : "+i);
					break;
				}
			}
		}
		if(!isFound) {
			System.out.println("Element couldn't be found!");
		}
	}

}
 