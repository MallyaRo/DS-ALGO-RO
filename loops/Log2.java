package loops;

import java.util.Scanner;

public class Log2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a = 0;
		for(float i= 1; i<=n ; i++) {
         if( i%2 == 0) {
        	 a = a - 1/i;
        	 
         }
         else {
        	 a = a + 1/i;
        	 
         }
         }
		System.out.println(" the result is "+ a);
	}

}
