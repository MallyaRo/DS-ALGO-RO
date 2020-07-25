package oops;

public class Statickeyword {
	  static {
		  System.out.println("in block 1");
	  }
	  static {
		  System.out.println("in block 2");
	  }

	public static void main(String[] args) {
		/* System.out.println(Math.PI);             
          System.out.println(Math.max(3, 5));
          System.out.println(Math.floor(4.544)+" "+ Math.ceil(4.23));*/
		A objA=new A();
		A.B objB =objA.new B();//or import oops.A.B
		A.C objC=new A.C();//ObjA is not mentioned
		System.out.println("inside main");
	}
	static {
		System.out.println("in block 3 ");
	}

}
