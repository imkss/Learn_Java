package vectorAndStack;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {

//		Vector<Integer> v = new Vector();
//		v.add(23);
//		v.add(45);
		 
		MyStack<Integer> stack = new MyStack<>();
		
//		stack.push(47);
//		stack.push(13);
//		stack.push(78);
		int popped = stack.pop();

		System.out.println(popped);
		
		popped = stack.pop();

		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
	}

}
