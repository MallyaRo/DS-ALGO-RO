package VectorsAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		/*Vector<Integer> v=new Vector();
         v.add(34);
         v.add(39);*/
		/*Stack <Integer> stack = new Stack();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		//System.out.println(stack.peek());
		//System.out.println(stack.pop());*/
		
		MyStack <Integer> stack = new MyStack();
		stack.push(12);
		stack.push(45);
		stack.push(33);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());//exception case
		
		
		
	}

}
