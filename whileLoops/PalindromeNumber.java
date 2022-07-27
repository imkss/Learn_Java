package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
	
		
		 System.out.println("Enter a number to check wheather it's palindrome or not :");
		 int num = sc.nextInt();
		 int temp = num;
		 int digit = 0;
		 while(temp > 0) {
			 int lastDig = temp % 10;
			 digit = digit *10 + lastDig;
			 temp /= 10;
			 }
		 if (digit == num) {
			 System.out.println(num + " is a palindrome number.");
		 }
		 else {
			 System.out.println(num + " is not a palindrome.");
		 }
		
		
		
		
//		int n = sc.nextInt();
//		
//		int  temp = n;
//		
//		int digit =  0;
//		
//		while(temp > 0) {
//			
//			int lastDigit = temp % 10;
//			
//			digit = digit*10 + lastDigit;
//			
//			temp /= 10;}
//		
//		if (digit == n) {
//			System.out.println(n + " is palindrome");
//		} else {
//			System.out.println(n + " is not a palindrome");}
//		
	}
	
}
