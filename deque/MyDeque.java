package deque;

public class MyDeque<E> {
     
	//using double linked list
	Node<E> head;
	Node<E> tail;
	public void addf(E data) {
		Node<E> toadd=new Node(data);
		if(head==null) {
			head=tail=toadd;
			return;
		}
		head.next=toadd;
		toadd.prev=head;
		head=toadd;
		
	}
	
	public E remlast() {
		Node<E> t;
		if(head==null) {
			return null;
		}
		t=tail;
		tail=tail.next;
		tail.prev=null;
		if(tail==null) {//when only 1 element is there
			head=null;
		}
		return t.data;
		
	}
	
	
	
	public static class Node<E>{
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data) {
			this.data=data;
			this.next=this.prev=null;
		}
	}
	
	
	
	
	
}
