package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		Map<String,Integer> num=new HashMap<>();
		/*num.put("one", 1);
		num.put("three", 3);
		num.put("two", 2);
		num.put("four", 4);
		num.put("five", 5);
		num.put("eight", 8);
		num.put("twelve",12);
		//now suppose we want to update
		num.put("one", 10);
		System.out.println(num.containsKey("three"));
		System.out.println(num.containsKey("nine"));
		System.out.println(num.containsValue(7));
		num.putIfAbsent("two", 8);
		num.remove("two");
		num.remove("eight", 11);
		//wont remove as eight has 8 not 11
		System.out.println(num.get("five"));
		System.out.println(num);
		System.out.println(num.get("two"));//value associated with a key
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		//to iterate over all entries and multiplying them with 10;
		Set <Entry<String,Integer>> ent= num.entrySet();
		for( Entry<String,Integer> e: ent) {
			e.setValue(e.getValue()*10);
		System.out.println(e);
		}*/
		System.out.println(gethash("GOD"));
		
	}
	
	public static int gethash(String s) {
		int hash=0;
		for(int i=0;i<s.length();i++) {
			hash+=s.charAt(i);
		}
		return hash;
	}

}
