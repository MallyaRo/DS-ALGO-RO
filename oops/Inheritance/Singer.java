package oops.Inheritance;

public class Singer extends Person {
     public Singer(String name) {
    	 super(name);
    	 
     }
	public void sing() {
		System.out.println(name+" is singing");
	}
	  public static void laugh() {
		   System.out.println("the person is laughing");
	   }
	//first  method is related to objects while  the static one relates to class
}
