package oops.Inheritance;

public class MainClass {
	
  public static void main(String[] args) {
	  // Teacher t= new Teacher();
	   //Singer s=new Singer();
	   Teacher t=new Teacher("Rohan");
	   t.eat();
	   t.walk();
	   Singer s=new Singer("helo");
	   s.eat();
	   s.walk();
	   s.sing();
	   s.laugh();
	  /* t.name="rohan";
	   s.name="ron";
	   t.teach();
	   t.eat();
	   s.sing();
	   t.walk();*/
	   //Person p=new Person();
	    //Teacher t=(Teacher)p;//p may be a tchr but to store inside tchr we have to explicitly convert into tchr 
	    //at run time we come to know that p is not a tchr
	   //but at compile time it didnt know
	   /*Teacher t1 =new Teacher();
	   t1.name=" rohan ";
	   
	   t1.walk();
	   Person p=t1;
	   //if this statement is shown then p becomes a singer  p=s;
	   Teacher t=(Teacher)p;
	   boolean yo=t1 instanceof Teacher;
	   System.out.println(t1 instanceof Teacher);
	   System.out.println(s instanceof Singer);
	   System.out.println(t1 instanceof Person);
	   System.out.println(t instanceof Person);
	   System.out.println(p instanceof Singer);
	   System.out.println(p instanceof Teacher);*/
  }
}
