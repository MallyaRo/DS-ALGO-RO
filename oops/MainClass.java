package oops;
class pig{
	boolean isfat;
	String color;
	int legs,eyes;
	
	public void walk() {
		System.out.println("The pig can walk");
	}
	public void eat() {
		System.out.println("The pig can eat");
	}
	public void description() {
		System.out.println("my pig has "+legs+" legs and "+eyes+" eyes");
	}
}

class dog{
int legs;
String color,name,breed;
public void walking() {
	System.out.println("The dog can walk");
}
public void jump() {
	System.out.println("The dog "+name+" is jumping");
}


}

public class MainClass {

	public static void main(String[] args) {
		//sc is the object of scanner class
		//one program can have only one public class
		pig porky = new pig();
		porky.legs=4;
		porky.eyes=2;
		
		pig goof =new pig();
		goof.legs=3;
		goof.eyes=2;
		dog tom = new dog();
		porky.walk();
		tom.name="tom";
		tom.jump();//if name is not assigned null is returned 
		porky.description();
		goof.description();
        
	}

}
