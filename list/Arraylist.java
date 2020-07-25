package list;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String>  fruits=new ArrayList();//we can also put list
      fruits.add("Apple");
      fruits.add("orange");
      fruits.add("banana");
      ArrayList<String>  veg=new ArrayList();
      veg.add("Carrot");
      veg.add("Potato");
      veg.add("Onion");
      fruits.addAll(veg);
      //************vvimp*****************
      String temp[]=new String[fruits.size()];
      //Object x[]=fruits.toArray();//instead of object if we write string we get an error
      fruits.toArray(temp);
      for(String e:temp) {
    	  System.out.println(e);
      }
      //************************************
      for(String e:fruits) {
    	  System.out.print(e+" ");
      }
      System.out.println();
      System.out.println(fruits.size());
      System.out.println(fruits.get(3));
      System.out.println(fruits.contains("Potato"));
      System.out.println(fruits.contains("Guava"));
      System.out.println(fruits.isEmpty());
     // fruits.add(23);
      System.out.println(fruits);
      ArrayList<Integer> marks=new ArrayList();
     fruits.set(2, "kiwi");
     System.out.println(fruits);
     fruits.remove(4);
     System.out.println(fruits);
     List<String> remove =new ArrayList();
     remove.add("orange");
     remove.add("Onion");
     fruits.removeAll(remove);
     System.out.println(fruits);
     fruits.clear();
     System.out.println(fruits);
     System.out.println(fruits.isEmpty());
      
      Double x=2.0;
      
      //to make pair
      //refer generics
      Pair<String,Integer> p1 =new Pair("Rohan",98);
      Pair<String,Float> p2 =new Pair("Rohan",9.88);
      p1.get();
      p2.get();
	}

}
