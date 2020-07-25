package methods;
import java.util.Scanner;

public class IntroductionToMethods {

	public static void main(String[] args) {
		 System.out.println("enter two numbers");
		 System.out.println();
		 Scanner sc =new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 
		 System.out.println("the greatest of two numbers is "+ max(a,b));//method calling
		 sayhi();
		 sayhi();
	}
	static int max(int a,int b) {
		return a>b? a:b ;
	}
	static void sayhi() {
		System.out.println("Hi how are you !");
		System.out.println("Good morning!");
	}
	

}
