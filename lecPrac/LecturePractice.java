package lecPrac;

import java.util.Scanner;

public class LecturePractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Print the length of the array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr3[] = new int[2*n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0; i < n; i++) {
			arr3[i+n] = arr2[i];
		}
		
		
		System.out.println("Array elements are: ");  
		
//		for (int i=0; i<(n*2); i++)   
//		{  
			System.out.println(arr3);
//		}  
		
		
		
//		int x, a, b, c;
//		a = 2;
//		b = 4;
//		c = 5;
//		x = a-- + b++ - ++c;
//		
//		System.out.println(x);
		
//		String mes = "";
//		String mess = null;
//		String mesy = "Joy with Java";
//				
//		int arrr [] = new int [9];
	
//		for(; ; ) {
//			System.out.println(1);
//		}
	}
		
//		static void swap(int x, int y) {
//			int temp = x;
//			x = y;
//			y = temp;
//		}
		
	}
	
//class Dog{
//	int leg, eye;
//	boolean isM, isF;
//	String name, color, breed;
//	
//	public void eat() {
//		System.out.println("My "+ name+" is eating.");
//	}
//	
//	public void fuck() {
//		System.out.println("My "+ name+" is fucking.");
//	}
//	
//	public void desc() {
//		System.out.println("My "+name+" is a "+breed+" dog. He has "+leg+" & "+ eye + " legs and eye respectively and having "+color+" color" );
//	}
//}
//
//class Cat{
//	int leg, eye;
//	boolean isM, isF;
//	String name, color, breed;
//	
//	public void walk() {
//		System.out.println("My "+ name+" is walking.");
//	}
//	
//	public void sleep() {
//		System.out.println("My "+ name+" is sleeping.");
//	}
//}
	
//public class LecturePractice {
//
//	public static void main(String[] args) {
		 
//		int x = 45;
//		int t = 65;
//		int result = maxOf(x,t);
//		int multiplication = multi(x,t);
//		int addition = add(x,t);
//		sayHi();
//		System.out.println(result + ", "+addition +" & " + multiplication);

//		Cat billa = new Cat();
//		Cat billi = new Cat();
//		Dog kutta = new Dog();
//		Dog kutti = new Dog();
//		  
//		billa.name = "Lowdu";
//		billi.name = "Jhatu";
//		kutta.name = "Sexu";
//		kutti.name = "Puchu";
//		kutta.breed = "German Shepherd";
//		kutta.color = "brown";
//		kutta.leg = 4;
//		kutta.eye = 2;
//		
//		billa.walk();
//		billi.sleep();
//		kutta.fuck();
//		kutti.eat();
//		kutta.desc();
		
//		int k = 8, l = 4;
//		swap(k,l);
//		System.out.println(k +" "+ l);
	
//		Dog l = new Dog();
//		l.legs = 2;
//		
//		Dog m = new Dog();
//		m.legs = 4;
//		swap(l,m);
//		System.out.println(l.legs +" "+ m.legs );
	
	
//	}
	
	
//	static int maxOf(int a,int b) {
//		return  a>b?a:b;
//	}
//	
//	static int multi(int a, int b) {
//		return a*b;
//	}
//	static int add(int a, int b) {
//		return a+b;
//	}
//	static void sayHi() {
//		System.out.println("Hii, How are you doing?\n");
//	}
	
//	static void swap(int x, int y) {
//		int temp = x;
//		x = y;
//		y = temp;
//	}
	
//	static void swap(Dog a, Dog b) {
//	Dog temp = a;
//	a = b;
//	b = temp;
//	}

	
	
	

//}

//
//class Dog{
//	int legs; 
//	
//}
