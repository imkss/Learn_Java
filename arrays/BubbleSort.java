package arrays;

import java.util.Scanner;

// import loops.Break;

public class BubbleSort {

	public static void main(String[] args) {
			
//		int a [] = {2, 1, 8, -3, 6, 4, 12};
//		
//		int n = a.length;
//
//		for (int i = 0; i < n-1; i++) {
//			
//			boolean sorted = true;
//			
//			for (int j = 0; j < n-1-i; j++) {
//				
//				if (a[j+1] < a[j]) {
//					
//					int temp = a[j+1];
//					
//					a[j+1] = a[j];
//					
//					a[j] = temp;
//					
//					sorted = false;}
//			   }
//			
//			if(sorted) break;}
//		
//	//This is an enhanced and easy way to write for loop in Arrays, Named as "For Each Loop"
//		
//		for(int item : a) {
//			
//	System.out.print(item + " ");}

		System.out.println("*****BUBBLE SORT*****\n");
		System.out.println("Enter the length of the array: ");
		Scanner sc =new Scanner(System.in);		
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the values to the array: ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < len-1; i++) {
			boolean sorted = true;
				for(int j = 0; j < len-1-i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false; 
				}
			}
			
			if (sorted) break;
		}
		System.out.println("The sorted array is: ");
		for(int item: arr) {
		System.out.print(item+ " ");
		}
		
	}
}