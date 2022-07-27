package oops.finalKeyword;

public final class Student {
//	final int ROLL_NO;
//	final String NAME;
//
//	{
//		ROLL_NO = 37;
//	}
//	public Student() {
//		NAME = "Sunny";
//	}
	
	String name;
	int rollNo;
	
	public final void getDescription() {
		System.out.println("The student name is "+ name);		
	}
	
}
