package oops;
class veh{
	int w;
	int h;
	String c;
	veh(){
		//default constructor
	}
	veh(int w){
		this.w=w;//this is a keyword
		h=2;
	}
	veh(int w,String c){
		this.w=w;
		this.c=c;
		h=2;
	}
}
public class MyConstructors {
      MyConstructors(){//no argument constructor
    	  System.out.println("the object is now created");
      }
	public static void main(String[] args) {
		
         // MyConstructors obj= new MyConstructors();
          veh car=new veh(4);
          veh rick=new veh(3);
          veh t=new veh(4,"red");//suppose we are unaware of something therefore method with int and string parameter is called
          //default is not allowed veh r=new veh();//allowed after we make the default one
          //to make the default one we have to make a default inside the class
          System.out.println(car.w+" wheels "+car.h);
          System.out.println(rick.w+" wheels "+rick.h);
          System.out.println(t.w+ " wheels "+t.h+" headlights "+t.c+" color");
	}

}
