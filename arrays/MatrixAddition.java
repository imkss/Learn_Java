package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the dimenssion of the matrix");
	int rows = sc.nextInt();
	int colm = sc.nextInt();
	int matA[][] = new int [rows][colm];
	int matB[][] = new int [rows][colm];
	int matSum[][] = new int[rows][colm];

	System.out.println("Enter the values of matrix 'A'");
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < colm; j++) {
			matA[i][j] = sc.nextInt();
		}
	}
	
	int mat2[][] = new int [rows][colm];
	System.out.println("Enter the values of the matrix 'B'");
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < colm; j++) {
			matB[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("The sum of the matrix is-");
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < colm; j++) {
			matSum[i][j] = matA[i][j] + matB[i][j];
			System.out.print(matSum[i][j] + " ");
		}
		System.out.println();}	
	}
}
