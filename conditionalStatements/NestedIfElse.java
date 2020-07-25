package conditionalStatements;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() ;
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
	//	if (a> b ) {
	//		if (a>c) {result = a;}
	//		else {result = c ;}
	//	}
		result = a> b ? a> c? a:c : c>b ? c : b;
	//ternary
		
	//	else {
	//		if (b<c) {result = c;}
	//		else {result = b; }
	//	}
		System.out.println("the largest no is "+ result);
		int x = 10;
		x+=5 ;
		System.out.println(x+result);
	}

}
