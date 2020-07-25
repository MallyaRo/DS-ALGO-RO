package queue;

import linkedLists.MylinkedList.Node;

public class MyQueue<E> {
	private Node<E> head,rear;
	
	
	public void enqueue(E e) {
		Node<E> toadd=new Node(e);
		if(head==null) {
			head=rear=toadd;
			return ;
		}
		
		rear.next=toadd;
		rear=rear.next;
	}
	
	
    public E dequeue() {
    	if(head==null) {
    	 return null;
    	}
		Node<E> temp=head;
		
		head=head.next;
		if(head==null) {
			rear =null;//incase only 1 element there
		}
		return temp.data;
	}
	
	
	
	
}
