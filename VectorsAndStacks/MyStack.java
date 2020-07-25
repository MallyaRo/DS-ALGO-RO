package VectorsAndStacks;

import linkedLists.MylinkedList;

public class MyStack<E>{
    private MylinkedList<E> ll=new MylinkedList<>();
    
    
	void push(E e) {
		ll.add(e);
		
	}
	
	E pop() throws Exception {
		if(ll.isemp()) {
			throw new Exception("popping from empty stack is not allowed");
		}
		return ll.removelast();
	}
	
	 
	E peek() throws Exception{
		if(ll.isemp()) {
			throw new Exception("peeking from empty stack is not allowed");
		}
		return ll.getlast();
	}
	
	
}
