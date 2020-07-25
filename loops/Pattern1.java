package loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number x !");
		int x = sc.nextInt();
		System.out.println("enter a number y !");
		int y = sc.nextInt();
		for(int j = 1; j <= y; j++ ) {
		for(int i =1;i<=x ; i ++) {
			System.out.print(" * ");
		} System.out.println();
		}
	}

}
