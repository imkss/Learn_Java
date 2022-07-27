package linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
//		List<Integer> ll = new LinkedList<>();
//		
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);

		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		

		for(int i = 1; i < 10; i++)
		myLL.add((5*i)/3*i +" Added");
		
		myLL.print();
		
//		ll.add(12);
//		ll.add(2);
//		ll.add(74);
//		ll.add(82);
//		ll.add(17);
//		ll.set(2,98);
//		
//		ll.toArray();
//		System.out.println(ll.get(2));
//		System.out.println(ll);		
	
	}
	
	static void getTimeDiff(List<Integer> List) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++)
			List.add(0,i);
			
		long end = System.currentTimeMillis();
		
		System.out.println(List.getClass().getName() +" --> " + (end - start));
	}

}
