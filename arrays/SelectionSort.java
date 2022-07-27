package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

//		int a[] = {3,1,-2,7,4,0};
//		
//		 int n = a.length;
//		
//		for(int i = 0; i < n-1; i++ ) {
//			
//			int minInd = i;
//			
//			for(int j = i; j < n; j++) {
//				
//			if(a[j] < a[minInd]) {
//				
//				minInd = j;}
//			}
//			
//			int temp = a[i];
//			
//			a[i] = a[minInd];
//			
//			a[minInd] = temp;}
//		
//		for(int item: a) {
//			
//			System.out.print(item + " ");}
		
		System.out.println("*****SELECTION SORT*****\n");

		System.out.println("Enter the length of the array: ");
		Scanner sc =new Scanner(System.in);		
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the values to the array: ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < len-1; i++) {
			int min_ind = i;
			for(int j = i; j < len; j++) {
			if(arr[j] < arr[min_ind]) {
				min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;			
		} 
		System.out.println("The sorted array is: ");
		for(int print: arr) {
			System.out.print(print+" ");
		}
				
	}

}
