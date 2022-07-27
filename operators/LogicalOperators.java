package operators;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		
	System.out.println("Enter your year");		
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if (year == 2 || year == 3  ) {
		System.out.println("You are eligible for Scholarship");
	}
	else {System.out.println("You are not eligible for scholarship");}
	}

}
