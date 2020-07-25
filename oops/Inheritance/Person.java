package oops.Inheritance;

public class Person {
	protected String name;//to pass on to the children class
	public Person(String name) {
		this.name=name;
		System.out.println("inside person constructor");
	}
   
   public void walk() {
	   System.out.println("PERSON" +name+" is walking ");
   }
   public void eat() {
	   System.out.println("PERSON"+name+" can eat ");
   }
   public static void laugh() {
	   System.out.println("the person is laughing");
   }
   
}
