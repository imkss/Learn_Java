package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		 List<String> fruits = new LinkedList<>();
//		 List<String> veg = new ArrayList();
		 fruits.add("Apple");
		 fruits.add("Mango");
		 fruits.add("Papaya");
		 fruits.add("Orange");
		 fruits.add("Graphs");
		 fruits.add("Strawberry");
		 fruits.add("Blackberry");
		 fruits.add("Blueberry");
		 		 
//		 veg.add("Potato");
//		 veg.add("Tomato");
		 
//		 System.out.println(fruits.get(0));
		fruits.set(0, "Banana");
		fruits.remove(1);
		
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Banana"));
//		fruits.clear();
		
		String temp [] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String  e: temp) {
			System.out.println(e);
		}
		
		
//		List<String> toRemove = new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Mango");
//		toRemove.add("Papaya");
//		toRemove.add("Orange");
//		toRemove.add("Graphs");
//		fruits.removeAll(toRemove);
		
		System.out.println(fruits);

		
//		 fruits.addAll(veg);
//		 System.out.println(fruits);

//		
//		 ArrayList<Integer> marks = new ArrayList<>();
//		
//		Pair<String, Integer> p1 = new Pair("Sunny", 37);
//		Pair<String, Boolean> p2 = new Pair("Pass", true);
//
//		p1.getDesc();
//		
//		p2.getDesc();
		
	}

}
