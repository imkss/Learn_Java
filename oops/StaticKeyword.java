package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("In block 1");
	}
	
	public static void main(String args[]) {
		System.out.println(Math.PI);
		System.out.println(Math.max(154.89, 48.25));
		System.out.println(Math.random());
		
		A obj_A = new A();
		B obj_B = obj_A.new B();
		
		C obj_C = new A.C();   
	}
	
	static {
		System.out.println("In block 2");
	}

}
