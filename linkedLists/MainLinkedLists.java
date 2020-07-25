package linkedLists;

import java.util.*;

public class MainLinkedLists {

	public static void main(String[] args) {
     /* List<Integer> ll=new LinkedList<>();//if we write arraylist also doesnt matter since its a part of list
      //only implementation matters
      List<Integer> al=new ArrayList<>();
     /* ll.add(12);
      ll.add(32);
      ll.add(240);
      ll.add(161);
      System.out.println(ll);
      System.out.println(ll.get(0));*/
     // gtTimedf(al);
     // gtTimedf(ll);
		MylinkedList<String> my=new MylinkedList<>();
		/*my.add(13);
		my.add(3);
		my.add(8);*/
		for(int i=0;i<100;i++) {
			my.add(i+"Added");
		}
		my.print();
      
	}
	static void gtTimedf(List<Integer> list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(i);
			//list.add(0,i);
		}
		long end =System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"-->"+(end-start));
	}

}
