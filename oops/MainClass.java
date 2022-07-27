//package oops;
//class Cat{
//			boolean fur;
//			String color, breed;
//			int legs, eyes;
//			
//			public void walk() {
//				System.out.println("Cat is walking");
//			}
//			public void eat() {
//				System.out.println("Cat is eating");
//			}
//			public void sleep() { 
//				System.out.println("Cat is sleeping");
//			}
//			public void desc() {
//				System.out.println("My cat has "+legs+" legs and "+eyes+" eyes. The breed is "+breed+ " and Color is "+ color);
//			}
//			
//}
//class Dog{
//			String name, breed;
//
//			public void jump() {
//				System.out.println("My dog "+ name+ " jumped.");
//			}
//			
//			public void desc() {
//				System.out.println("My dog name is "+name+" and breed is "+breed);
//			}
//}
//public class MainClass {
//	public static void main(String[] args) {
//		
//		Cat c1 = new Cat();
//		Cat c2 = new Cat();
//		
//		c1.legs = 3;
//		c2.legs = 4;
//		c1.color = "black";
//		c2.color = "brown";
//		c1.eyes = 2;
//		c2.eyes = 1;
//		c1.walk();
//		c2.eat();
//		c1.breed = "bimran";
//		c2.breed = "ragdoll";
//		
//		c1.desc();
//		c2.desc();
//
//		Dog d1 = new Dog();
//		Dog d2 = new Dog();
//		
//		d1.name = "Champu";
//		d2.name = "Raju";
//		d1.breed = "Husky";
//		d2.breed = "Dingo";
//				
//		d1.jump();
//		d2.jump();
//		d1.desc();
//		d2.desc();
//	}
//
//}

package oops;
class Cat{
	boolean hasfur;
	String color, breed;
	int leg, eye;
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void desc() {
		System.out.println("My cat has "+leg+" legs and "+eye+" eyes.");
	}
}
class Dog{
	
	String name;
	
	public void jump() {
		System.out.println("My dog "+name+" is jumping");
	}
	
}
public class MainClass{
public static void main(String args[]) {
	Cat cat1 = new Cat();
	Cat cat2 = new Cat();
	
	cat1.leg = 4;
	cat1.eye = 2;
	
	cat1.desc();

	cat1.walk();
	cat2.eat();
	
	
	Dog D1 = new Dog();
	Dog D2 = new Dog();
	D1.name = "Lawdu";
	D2.name = "Lalit";
	D1.jump();
	}
}

