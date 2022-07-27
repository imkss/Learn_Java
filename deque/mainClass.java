package deque;

import java.util.ArrayDeque;

public class mainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		ad.addFirst(15);
//		ad.addFirst(23);
//		
//		ad.pop();
//		System.out.println(ad.peek());
		
		ad.push(34);
		ad.push(89);
		System.out.println(ad.pop());
		System.out.println(ad.pop());

	}

}
