package conditionalStatements;
import java.util.Scanner ;
public class SwitchCaseStatements {

	public static void main(String[] args) {
//		int dayOfWeek= 2;
//
//		switch ( dayOfWeek) {
//		case 1 : System.out.println("i am on leave");
//		break ;
//		case 2 : System.out.println("i am in college");
//		break;
//		case 3 :System.out.println("i am playing cricket");
//		break;
//		default : System.out.println("i dont know what day it is");
		Scanner sc =new Scanner(System.in);
		System.out.println("please rate the food !");
		System.out.println("enter rating from 1 to 5");
		int rating = sc.nextInt();
		switch(rating) {
		case 1: System.out.println("pathetic food");
		break;
		case 2:
			System.out.println("bad food");
			break;
		case 3:
			System.out.println("average food");
			break;
		case 4:
			System.out.println("good food");
			break;
		case 5:
			System.out.println("excellent food ");
			break;
		default : System.out.println("invalid");}
		
		 
		
		
		
	}

}
