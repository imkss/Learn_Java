package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimenssion of matrix 'A'");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int m1 [][] = new int[r1][c1];
		
		System.out.println("Enter the dimenssion of matrix 'B'");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int m2 [][] = new int[r2][c2];
		int mul [][] = new int[r1][c2];
		if(c1 != r2) {
			System.out.println("Matrix Multiplication Is Not Possible.\n*Tip: The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
		}
		else {
		System.out.println("The size of the matrix AB is: "+r1+ "*" +c2 );
		System.out.println("Enter the values of matrix 'A'");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the values of the matrix 'B'");
		for(int i = 0; i < r2; i++) {
			for(int j = 0; j < c2; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
	System.out.println("AB =");
	for(int i = 0; i < r1; i++) {
		for(int j = 0; j < c2; j++) {
			mul[i][j] = 0;
			for(int k = 0; k < c1; k++) {
			mul [i][j] += m1[i][k] * m2[k][j];}
			System.out.print(mul[i][j] + " ");
			}
		System.out.println();}
		}
	}
}
