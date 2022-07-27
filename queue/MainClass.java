package queue;

//import java.util.LinkedList;
//import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {

//		Queue<Integer> q = new LinkedList<>();
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(52);
		mq.enqueue(31);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());

		
//		q.add(12);
//		q.add(2);
//		q.add(95);
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.poll());
		
//		System.out.println(q.element());
	}

}
