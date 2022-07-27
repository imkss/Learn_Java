package conditionalStatement;
import java.awt.image.RescaleOp;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter three number to find the greatest number among of them");
	
//		System.out.println("Enter three number to find the greatest number among of them");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if(a > b & a > c) {
//			System.out.println(a + " is greatest of all three numbers.");
//		
//		if(a > b & c > a) {
//			System.out.println(c  + " is greatest of all three numbers.");}
//		}
//		else {		
//		System.out.println(b + " is greatest of all three numbers.");
//		}
		
		
		System.out.println("Enter three number to find the greatest number among of them");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;
		
		res = a > b ? a > c ? a : c : b > c ? b : c;
		
//		
//		if (a > b) 
//		{
//			if (a > c)
//		{
//				res = a;
//		} else 
//		{
//			res = c;}
//		} else 
//		{
//			if (b > c)
//		{
//			res = b;}
//		 else 
//		{
//			 res = c;}
//		}
	System.out.println(res+ " is the maximum of the all.");
			
		
			}			
	}

