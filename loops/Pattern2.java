package loops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		
		for(int j = 1 ; j<=n ; j++) {
		for(int i = 1; i<=n-j+1 ;i++) {
			System.out.print("*");
		}System.out.println();
	}
		 
		int a = sc.nextInt();
		for( int i=1; i<=a ; i++) {
		for(int j = 1; j <=a-i;j++ ) {
			System.out.print("  ");
		}
		for(int j =1; j<=i; j++) {
		System.out.print("* ");
		}System.out.println();	
		}

	} 

}
