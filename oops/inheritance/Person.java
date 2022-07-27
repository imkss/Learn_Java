package oops.inheritance;

public class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside person constructor");
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
	
	public void eat() {
		System.out.println(name +" is eating");
	}
	
	public static void laughing() {
		System.out.println("Person is laughing");
	}

}
