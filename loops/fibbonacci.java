package loops;

import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci terms you want");
		int x = sc.nextInt();
		int a = 0, b = 1, sum = 0;
		switch (x) {
		case 1:
			System.out.print(a + " ");
			break;
		case 2:
			System.out.print(a + " ");
			System.out.print(b + " ");
			break;
		default:
			System.out.print(a + " ");
			System.out.print(b + " ");
			for(int i = 0; i < x-2; i++) {
				sum = a+b;
				a = b;
				b = sum;
				System.out.print(sum + " ");
			}
			break;
		}
				
////		System.out.println("Enter the number");
////		int n = sc.nextInt();
////		
////		int a = 0;
////		int b = 1;
////		
////		System.out.print(a + " ");
////		System.out.print(b + " ");
////				
////		for ( int i = 0; i < n - 2; i++) {
////			
////			int c = a + b;
////			System.out.print(c + " ");
////		    a = b;
////		    b = c;
////		}
//		
	}

}
