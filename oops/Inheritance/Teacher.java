package oops.Inheritance;

public class Teacher extends Person {
	
	
   public Teacher(String name) {
	   super(name);//parent class constructor called
	   System.out.println("inside tchr constructor ");
   }
	
	public void teach() {
		System.out.println(name+" can teach");
	}
	public void walk() {//method overriding 
		super.walk();//will execute the defn of the parent first
		   System.out.println("PERSON " +name+" can walk ");
	   }
	  public static void laugh() {
		   System.out.println("the person is laughing");
	   }
	  //first two methods are related to objects while  the static one relates to class 
}
