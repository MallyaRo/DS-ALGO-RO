package oops.finalKeyword;

public class MainClass extends student{//if student is made final then main class cant be extended to student 
	//has to be initialized 
	final int a=9;
	//public void jump() {
		//System.out.println("inside main class");//Overridden 
	//} cant overide as in student we have made that jump() final hence cant be changed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final student s1=new student();
		student s2=new student();
		//s1=s2;//not allowed as s1 is final and cant be assigned
		//s1 has reference of s2
		s1.a=3;
		s1.a=6;//we can change anything inside the final oject but we cant change the reference thats it 
       final String name="Rohan";
       // not allowed as it cant be reassign it,name="tom";
       //local final varibles if not assigned dont give error but better to assign
       MainClass obj =new MainClass();
       obj.jump();
	}

}
