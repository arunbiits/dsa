package io.arun.learning.dsa.sumofpairs;

import java.util.Scanner;

public class SumOfPairSimpleSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		long sum = sc.nextLong();
		System.out.println("Pairs are as follows:-");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
		sc.close();
	}

}
