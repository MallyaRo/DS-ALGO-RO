package priorityQueue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		PriorityQueue<Integer> ad=new PriorityQueue<>();
		pq.add("Kiwi");
		pq.add("Banana");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Orange");
        System.out.println(pq);//randomly stored
        //but when  they come out they come out in sorted fashion 
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        ad.add(79);
        ad.add(87);
        ad.add(89);
        ad.add(71);
        ad.add(83);
        ad.add(91);
        ad.add(91);
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
	}

}
