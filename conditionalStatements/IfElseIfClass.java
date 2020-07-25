package conditionalStatements;
import java.util.Scanner ;  
public class IfElseIfClass {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	//	int num = sc.nextInt();
	//	if(num<= 10 ) {System.out.println("number is less than 10");}
	//	else if (num >10 && num < 20  ) {System.out.println("the number is greater than 10  and less than 20");
	//	}
	//	else if (num >= 20 && num < 30){System.out.println("the number is greater than 20 and less than 30");	
	//	}
	//	else {System.out.println("the number is greater than 30 ");
	//	}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int MaxOfBoth= 1 ;
	//	if (a>b ) {MaxOfBoth = a ;}
	//	else { MaxOfBoth = b ;}
	MaxOfBoth= a>b ? a:b;
	System.out.println("the max of both nos is "+ MaxOfBoth);
	 
		}

	}




