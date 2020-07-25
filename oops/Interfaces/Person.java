package oops.Interfaces;

public class Person implements Student,Youtube{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person obj=new Person();
     obj.study();
     obj.makeVideo();//person uses both the features of student and youtuber
     //not allowed Youtube o=new Youtube();
     Youtube obj2=obj;//upcasting and is allowed,this is not instantiation
     //obj is implementing both student and youtube 
     //but obj2 is only for youtube
     obj2.edit();
     obj2.makeVideo();//only youtuber fxn is allowed
	}
   //to not implement the below fxns , make Person abstract
	// now see, upload video is not to be implemented , we can or not overrideas we had given default implementation
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is studying");
		
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making a video");
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("video is edited");
		
	}

}
