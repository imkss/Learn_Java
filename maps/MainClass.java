package maps;

import java.util.Map.Entry;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Map<String, Integer> number = new HashMap<>();
//		
//		number.put("one", 1);
//		number.put("two", 2);
//		number.put("five", 5);
//		
//		number.putIfAbsent("one", 101);
//		System.out.println(number.containsKey("two"));
//		
//		number.remove("five", 6);
//		System.out.println(number);
//		
//		System.out.println(number.keySet());
//		System.out.println(number.values());
//		System.out.println(number.entrySet());
//		
//		Set<Entry<String, Integer>> entries = number.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		System.out.println(number);
		
		System.out.println(getHash("Cat"));
		System.out.println("Ball");
		
		
		
	

	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i < s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
