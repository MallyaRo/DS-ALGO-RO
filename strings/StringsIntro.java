package strings;
import java.util.Scanner;
public class StringsIntro {

	public static void main(String[] args) {
		String name = "rohan";
		Scanner sc= new Scanner (System.in);
		String name1 = "   Custard Apple     ";
		//System.out.println("enter a string:");
		//String name1=sc.next();
		//both name and name 1 in same string pool area
		
		String anotherName = new String("rohan");// new comes from heap area 
		System.out.println(name);
		//initialization by literals used for old ones ..which frequently repeats ..from string pool area
		// when new value is entered..it enters (heap area + (string pool area) )
		System.out.println(name==anotherName); // false as the literal name is coming from string pool area while the
		//new one from heap area
		// strings are immutable 
		name="roh"; //rohan is not erased therefore immutable
		//roh is also created extra and assigned to name 
		System.out.println(name1.charAt(3));
		System.out.println(name1.length());
		System.out.println(name1.substring(2));
		System.out.println(name1.substring(3, 9));
		System.out.println(name1.subSequence(2,9));
		System.out.println(name1.contains("Apple"));
		System.out.println(name1.equals(name));
		System.out.println(name1.concat(name));
		name1=name1+name+name;
		System.out.println(name1);
		System.out.println(name1.replace('a','o'));
		String fruits ="apple,orange,banana,mango,guava,melon,grapes,durian";
		String fu[]=fruits.split(",");
		for(String fruit: fu) {
		System.out.println(fruit);
		
		}
		System.out.println(name1.indexOf('p'));
		System.out.println(name1.toLowerCase());
		System.out.println();
		System.out.println(name1+" "+name1.trim());
	}

}
