package io.arun.learning.dsa.sumofpairs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPairOptimalSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		long sum = sc.nextLong();
		int low=0,high=arr.length-1;
		Arrays.sort(arr);
		System.out.println("Pairs are as follows:-");
		while(low<high) {
			if(arr[low] + arr[high] == sum) {
				System.out.println(arr[low]+" and "+arr[high]);
			}
			if(arr[low] + arr[high] > sum) {
				high--;
			}else {
				low++;
			}
		}
		sc.close();
	}

}
