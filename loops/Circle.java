package loops;
import java.util.*;
import java.lang.Math;
public class Circle {
	public static void print(int r,float p) { double d;
     for(int i=0;i<=2*r+1;i++) {
      	 
     for(int j=0;j<=2*r+1;j++) {
    	 d=Math.sqrt(Math.pow(i-r,2)+Math.pow(j-r, 2));
    	 if(d>(r-p)&&d<(r+p)) {
    		 System.out.print("*");
    	 }
    	 else 
    		 System.out.print(" ");
    	 
     }
     System.out.println();

     
     }
     }
     //driver code
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);	
	 int r;float p;
	 System.out.println("enter the radius and precision");
	 r=sc.nextInt();
	 p=sc.nextFloat();
     print(r,p);
	}

}
