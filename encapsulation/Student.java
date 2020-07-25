package encapsulation;

public class Student {
	
	
   private int age;
   private String name;
   //getters and setters method
    public int getage() {
    return this.age;	
    }
    public void setage(int age) {
    	if(age>20) {
    		System.out.println("Invalid age");
    	}
    	else {
    	this.age=age;
    	}
    }
    //to use getters and setters right click ,source, generate get set
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	By using getter and setter, the programmer can control how their important variables are 
	accessed and updated in the proper manner, such as changing the value of a variable within a specified range
	*/
   
   
}
