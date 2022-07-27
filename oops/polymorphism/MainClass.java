package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {

//		RUN TIME POLYMORPHISM
		
		Dog d = new Dog();
//  Upcasting
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();
		System.out.println("Name of dog "+ d.name +"\nName of pet "+ p.name);
		
		
//		a.walk();
		
//		COMPILE TIME POLYMORPHISM
		
		greeting();
		greeting("Welcome Home!");
		greeting("Motu!!!", 5);

		
	}
	
	public static void greeting() {
		System.out.println("Hii, There!");
	}
	
	public static void greeting(String s) {
		System.out.println(s);
	}
	
	public static void greeting(String s, int count) {
		for(int i = 0; i < count; i++)
		System.out.println("Happy Birthday "+s);
	}

}
