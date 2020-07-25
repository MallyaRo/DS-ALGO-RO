package linkedLists;

public class MylinkedList<E> {
	
	 Node head;
	 //initially head is null
	 
	 
	 
	public void add(E data) {
		 Node toadd=new Node(data); 
		 if(isemp()) {
			 head=toadd;
			 return;
		 }
		 Node temp =head ;
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=toadd;
		 
	 }
	
	
	public E removelast() throws Exception{
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("cannot remove last element from empty linked list");
		}
		if(temp.next==null) {
			Node<E> toremove =head;
			head=null;
			return toremove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toremove=temp.next;
		temp.next=null;
		return toremove.data;
		
	}
	
	 
	 public boolean isemp() {
		return head==null;
	 }
	 
	 
	 
	 
	 public void print() {
		 Node temp=head;
		 System.out.print("[ ");
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 System.out.print("]");
	 }
	 
	 
	 public E getlast() throws Exception{
		 Node<E> temp=head;
			if(temp==null) {
				throw new Exception("cannot peek last element from empty list");
			}
			if(temp.next==null) {
				Node<E> toremove =head;
				head=null;
				return toremove.data;
			}
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			return temp.data;
	 }
	
    public static class Node<E>{ //we make this static so that anyone outside can access
    	 public E data;
    	 public Node next;
    	 
    	 public Node(E data) {//constructor
    		 this.data=data;
    		 next=null;
    	 }
    	 
     }
     
     
     
}
