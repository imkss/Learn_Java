package conditionalStatement;
import java.util.Scanner;
public class IfClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
//		System.out.println("Plese enter a number");
//		int num = sc.nextInt();
//		if(num < 33) {
//			System.out.println("Your marks is " + num + ". You are fail.");}
//		
//		else if ( num > 33 && num <=  100);{
//			System.out.println("Your marks is "+ num + ". You are pass.");}
		
//		System.out.println("Please the number of the petal in the flower");
//		int petel = sc.nextInt();
//		if(petel % 2 == 0) {
//			System.out.println("He loves me");
//		}
//		else {System.out.println("He loves me not");}
//		
		
//		System.out.println("Please enter a number");
//		int num = sc.nextInt();
//		if(num > 0) {
//			System.out.println(num + " is a positive number");
//		}
//		else if (num < 0) {
//			System.out.println(num + " is a nagative number");
//		}
//		else {System.out.println("This is ZERO");}
		
		
//		System.out.println("Enter your age please:-");
//		int age = sc.nextInt();
//		if(age >= 18) {
//			System.out.println("You can apply for votar card.");
//		}
//		else {System.out.println("Sorry you can not be a voter now.");
//		}
		
		
//		System.out.println("Enter the age please.");
//		int age = sc.nextInt();
//		if (age >= 18) {
//			System.out.println("You can vote.");
//		}
//		else {System.out.println("You can not vote.");}
		
//		System.out.println("Please enter the no of patels-");
//		int no_of_patels = sc.nextInt();
//		if  (no_of_patels % 2 == 0) {
//			System.out.println("She LOVES me :)");
//		} 
//		else {
//			System.out.println("She LOVES me NOT :(");
//		}
		
//		System.out.println("Please enter a positive number");
//		int no = sc.nextInt();
//		if (no <= 10) {
//			System.out.println("The number is less thne 10");
//		}
//		else if(no > 10 && no <= 20) {
//			System.out.println("The number is between 10 and 20");
//		}
//		else if(no > 20 && no <= 30) {
//			System.out.println("The number is between 20 and 30");
//		}
//		
//		else {System.out.println("The number is greater then 30");}
//		
//		TERNARY OPERATOR
//		int a = 5;
//		int b = 9;
//		int maxOfBothNumbers = a > b ? a : b;
//		System.out.println("Max of both numbers is " + maxOfBothNumbers);
//		
	
		int a = 142, b = 13, c = 8, max;
//		max = x>y?x:y;
//		System.out.println("maximum of the both number is " + max);
		
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("maximum of the all number is " + max);
		int result = 0;
//		result = a > b ? a > c ? a : c : b > c ? b : c;
		 
	
	}
 
}
