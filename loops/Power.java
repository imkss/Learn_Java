package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the exponent");
		int b = sc.nextInt();
		int res = 1;
		for(int i = 0; i < b; i++) {
			res *= a;
		}
		System.out.println("Value = " + res);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int result = 1;
//		
//		for(int i = 1; i <= b; i++){
//			 
//			result *= a;
//		}
//		System.out.println(result);
	}

}
