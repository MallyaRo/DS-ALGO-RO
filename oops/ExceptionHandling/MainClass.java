package oops.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*try{int a =5;
       int b=0;
       //int c=a/b;//arithmetic exception throw
       //int g[]=new int[3];
       //System.out.println(g[5]);
       //System.out.println(c);//this is not printed since exception is caught
       //as c=a/b is first that exception is shown only
	}
       
       
       catch(ArithmeticException e) {//instead of arithmetic exception if we write exception,its fine
       //fine tuning not there,all exceptions will be handled
		System.out.println(e.getMessage()+" error ,please check your code ");
	}
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println(" Rohan, index out of bound ");
       }
       catch(IllegalArgumentException e) {
    	   System.out.println("  Illegal casting");
       }
       finally {
    	   System.out.println("srry   ");
       }
       System.out.println("VVIMP ,NEEDS TO RUN");*/
		
      
		fx1();
		

	}
       static void fx1(){
    	   int a=10;
    	   int b=3;
    	   int c=a/b;
    	   System.out.println(c);
    	   try {
			Thread.sleep(1000);//if not used within try catch may throw an exception //to be handled
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	   System.out.println("after 1000ms");
    	   try {
    		Thread.sleep(1000); //system will sleep for 1000ms then others will start running  
    	    f2();
    	    
    	   }
    	   catch(Exception e){
    		   System.out.println(e.getMessage()+" occured");
    	   }
    	   
    	   }
       static void f2()throws ArrayIndexOutOfBoundsException{
    	   boolean d=true;
    	   if(d) {
    	   throw new ArrayIndexOutOfBoundsException("danger was coming");
    	   }
       }
       
       
       
       
       
       
       }
       
       

