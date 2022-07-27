//package methods;
//
//
//
//class Dog{
//	 int leg;
//}
//
//public class PassByValue {
//public static void main(String[] args) {
//			
////		int c = 78, d = 8;
////		swap(c, d);
////		System.out.println(c +" "+ d);
//	
//		Dog d1 = new Dog();
//		d1.leg = 4;
//		Dog d2 = new Dog();
//		d2.leg = 3;
//		
//		swap(d1, d2);
//		System.out.println(d1.leg + " "+ d2.leg);
//		}
//
//
////static void swap(int a, int b) {
////	int temp = a;
////	a = b;
////	b = temp;
////	}
//	
//static void swap(Dog a, Dog b) {
//	Dog temp = a;
//	a = b;
//	b = temp;
//}
//
//
//}
//	
package methods;
class Dog{
	int legs;
}
public class PassByValue{
	
		public static void main(String args[]) {
		int c = 23, d = 67;
		swap(c, d);
		System.out.println(c+" "+d);
		
		Dog kutta = new Dog();
		kutta.legs = 4;
		Dog kutti = new Dog();
		kutti.legs = 3;
		
		swap(kutta, kutti);
		
//		System.out.println(kutta.legs+" "+ kutti.legs);
		
		Dog muted = new Dog();
		muted.legs = 4;
		changeDog(muted);
//		System.out.println(muted.legs);
		
		}
	
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
//		a.legs = 1;
//		System.out.println(a.legs);
	}
	
	static void changeDog(Dog dog) {
		dog.legs = 5;
	}
	
	static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		a = 1;
		System.out.println(a);
	}
}
