package io.arun.learning.dsa.saddlepointofmatrix;

import java.util.Scanner;

public class SaddlePointOfMatrixOptimalSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value:");
		int row = sc.nextInt();
		System.out.println("Enter the column value:");
		int col = sc.nextInt();
		System.out.println("Enter the matrix values one by one:");
		long[][] mat=new long[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j] = sc.nextLong();
			}
		}
		System.out.println(mat.length);
		System.out.println("Saddle points are as follows:-");
		int count=0;
		//Minimum and Maximum check
		for(int i=0;i<mat.length;i++) {
			long min_row =  mat[i][0];
			int col_ind=0;
			for(int j=1;j<mat.length;j++) {
				if(min_row > mat[i][j]) {
					min_row = mat[i][j];
					col_ind = j;
				}
			}
			
			int k;
			for(k=0;k<mat.length;k++) {
				if(mat[k][col_ind] > min_row) {
					break;
				}
			}
			if(k==mat.length) {
				count++;
				System.out.println(" "+min_row);
			}
		}
		
		//Maximum and Minimum check
		for(int i=0;i<mat.length;i++) {
			long max_row =  mat[i][0];
			int col_ind=0;
			for(int j=1;j<mat.length;j++) {
				if(max_row < mat[i][j]) {
					max_row = mat[i][j];
					col_ind = j;
				}
			}
			
			int k;
			for(k=0;k<mat.length;k++) {
				if(mat[k][col_ind] < max_row) {
					break;
				}
			}
			if(k==mat.length) {
				count++;
				System.out.println(" "+max_row);
			}
		}
		if(count==0) {
			System.out.println("Saddle point not found!");
		}
		
		sc.close();
	}
	
}
