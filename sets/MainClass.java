package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Set<String> a=new HashSet<>();
		Set<String> b=new LinkedHashSet<>();
		Set<String> c=new TreeSet<>();
		
		a.add("apple");
		a.add("banana");
		a.add("kiwi");
		a.add("mango");
		a.add("papaya");
		a.add("chilli");
		b.add("apple");
		b.add("apple");
		b.add("banana");
		b.add("kiwi");
		b.add("mango");
		c.add("apple");
		c.add("apple");
		c.add("banana");
		c.add("kiwi");
		c.add("mango");
		c.add("pineapple");
		c.add("chickoo");
		c.add("orange");
        c.add("tomato");
        c.addAll(a);
		System.out.println(a.add("kiwi"));
		System.out.println(a);//printed in same order
		System.out.println(b);//in  same order as we stored
		System.out.println(c);//in a sorted order
		c.retainAll(a);
        System.out.println(c);	
        System.out.println(c.containsAll(b));
	}

}
