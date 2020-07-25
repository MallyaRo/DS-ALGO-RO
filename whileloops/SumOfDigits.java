package whileloops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp>0 ) {
			 int lastDigit = temp % 10;
			 temp /= 10;
			  sum+= lastDigit;
		  System.out.println(lastDigit + " "+ temp+ " "+ sum );
	}
		System.out.println("The Sum of the Digits of  the Number " + n +" is "+ sum);
	//	int a = (int)Math.log10(n) +1 ;// no of digits
		
     //   System.out.println(a);
	}

}
