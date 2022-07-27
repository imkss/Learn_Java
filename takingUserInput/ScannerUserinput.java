package takingUserInput;
import java.util.Scanner;
public class ScannerUserinput {

	public static void main(String[] args) {
		
		System.out.println("Please enter your Name, Age and Marks -");
		
		Scanner sunny = new Scanner(System.in);
		
		String Name = sunny.nextLine();
		int Age = sunny.nextInt();
		int Marks = sunny.nextInt();
		float parcentage = sunny.nextFloat();
		
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Marks);

		System.out.println("Please Enter the Principal, rate and time");
		
		Scanner math = new Scanner(System.in);
		
		int Principal = math.nextInt();
		float rate = math.nextFloat();
		byte time = math.nextByte();
		
		double Simple_Intrest = Principal*rate*time/100;
		System.out.println("Simple Intrest = " + Simple_Intrest);
		
		
	}

}
