package loops;

import java.util.Scanner;

public class XRaisedToy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 1; i <= y ; i++) {
			// result = result*x;
			   result*=x;
			
		}
		 System.out.println(result);
	}

}
