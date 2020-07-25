package oops.Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		/*Dog d =new Dog();
		Pet p=d;
		Animal a=d;//upcasting or implicit casting
		d.walk();
		p.walk();//both time we get the dog walking 
		//this is called run time polymorphism as on run time it came to know that object p is a dog
		//a.walk() not allowed*/
		Dog d =new Dog();
		Pet p=d;
	 greet();
	 greet("rohan");
		greet("kings rohan",8);
     System.out.println(d.name+"  "+p.name);//variables can't be overridden only methods are hidden variables can be hidden only
	}
	public static void greet() {
		System.out.println("hi ,there!");
	}
	//method overloading in which both have different signatures
	public static void greet(String s) {
		System.out.println(s);
	}
	public static void greet(String s,int c) {
		for(int i=0;i<c;i++) {
			System.out.println("hi ,there "+s);
		}
	}
	//multiple behaviour and forms shown
	

}

