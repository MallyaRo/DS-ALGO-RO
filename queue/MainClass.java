package queue;

import java.util.*;


public class MainClass {

	public static void main(String[] args) {
		/*Queue<Integer> q=new LinkedList<>();
		//we get exception if we q.remove() for empty ;
	     System.out.println(q.poll());//no exception,only null returned
	     //exception thrown System.out.println(q.element());
	     System.out.println(q.peek());
         q.add(3);
         q.add(5);
         q.add(9);
         q.add(4);
         System.out.println(q);
         System.out.println(q.element());
         System.out.println(q.remove());
         System.out.println(q.remove());
         System.out.println(q);
         System.out.println(q.element());*/
		
		
		//implementing our own queue
		MyQueue<Integer> q=new MyQueue<>();
		q.enqueue(12);
		q.enqueue(8);
		q.enqueue(89);
		q.enqueue(45);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(77);
		System.out.println(q.dequeue());
	}

}
