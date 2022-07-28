package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		System.out.println(fruits.add("Kiwi"));
//		System.out.println(fruits.add("Banana"));
//
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(13);
		x.add(56);
		x.add(21);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(6);
		y.add(21);
		
		x.addAll(y);
		System.out.println(x);
		
	}

}
