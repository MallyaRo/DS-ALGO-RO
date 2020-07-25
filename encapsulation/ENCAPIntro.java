package encapsulation;

public class ENCAPIntro {

	public static void main(String[] args) {
		
		
		Student obj=new Student();
       // obj.name="Rohan";
       // obj.age=19;
		
		obj.setage(12);
		System.out.println(obj.getage());
	}
	//By using getter and setter, the programmer can control how their 
	//important variables are accessed and updated in the proper manner,
	//such as changing the value of a variable within a specified range
    
}
