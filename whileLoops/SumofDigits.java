 package whileLoops;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number to sum the digits:-");
		int n = sc.nextInt(); 
		int temp = n;
		int sum = 0;
		while(temp > 0) {
			
			int lastDigit = temp % 10;
			temp /= 10;
			sum += lastDigit;
		}
		System.out.println("The sum of digits of " + n + " is " + sum );

//		int n = sc.nextInt();
//		int noOfDigit = (int)Math.log10(n) + 1;
//		System.out.println(noOfDigit);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the digit to get sum: ");
//		int num = sc.nextInt();
//		int temp = num;
//		int sum = 0;
//		while(temp > 0) {
//			
//			int las_dig = temp% 10;
//			temp /= 10;
//			sum += las_dig;
//		}
//		System.out.println("The sum of "+ num + " is "+ sum);
	}

}
