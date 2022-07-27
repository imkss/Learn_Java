package loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
//		System.out.println("I want the table of...");
//		int table = sc.nextInt();
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("\t"+  table * i);
//		}
		System.out.println("Table of 1 to 20 \n");
		for(int i = 1; i <= 20; i ++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print( i*j+ " ");
			} System.out.println("\n");
		}
		
//		for(int i = 1; i <= 20; i ++) {
//		
//		for(int j = 1; j <= 10; j++) 
//	
//			System.out.print(i * j + " ");
//		
//			System.out.println();
//		}
    	
	} 

}
