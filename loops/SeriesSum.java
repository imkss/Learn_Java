package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the terms:\n");
		int n = sc.nextInt();
		float res = 0;
		for(float i = 1; i <= n; i++)
		{if(i%2 == 0)
			res -= 1/i;
		if(i%2 != 0)
			res += 1/i;
		}
		System.out.println("The sum of the series is "+ res);
		
//		for(float i = 1; i <= n; i++) {
//			res +=  1/i;
//		}
//		System.out.println("The sum of the series is "+ res);
//		
		
//		
//		float result = 0f;
////		
//		for(float i = 1; i <= n; i++) {
//			
//			result += 1/i;  
//		}
//		System.out.println(result);
		
//		for(float i = 1; i <= n;   i++) {
//			
//			if(i % 2 == 0) {
//				
//				result -= 1/i;
//					}
//			else {
//				
//			result += 1/i;}
//	      }
//		
//		System.out.println(result);
		
		
		
		
	}

}
