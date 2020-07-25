package deque;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		/*ArrayDeque <Integer> ad =new ArrayDeque<>();
        ad.addFirst(23);
        ad.addFirst(89);
        ad.addFirst(9);
        ad.addFirst(99);
        ad.pop();
        System.out.println(ad.peekLast());
        //can be used as a stack also
        ad.push(12);
        ad.push(88);
       System.out.println(ad.pop());
       System.out.println(ad.pop());
       System.out.println(ad.pollLast());
       System.out.println(ad.pop());*/
		MyDeque<Integer> ad=new MyDeque<>();
		ad.addf(23);
		ad.addf(89);
		ad.addf(9);
		ad.addf(45);
		System.out.println(ad.remlast());
		System.out.println(ad.remlast());
		System.out.println(ad.remlast());
	}

}
