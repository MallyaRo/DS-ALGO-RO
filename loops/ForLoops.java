package loops;
import java.util.Scanner;
public class ForLoops {

	public static void  main (String[] args) {
//		int a = 5;
//		for(int i = 0 ; i < 1000; i = i + 900) {
//			System.out.println("hello world " + i);
//			
//		}
//		int sum = 0;
//		int n = 10;
//		for (int i = 1 ; i <n ; i++) {
//			sum = sum + i;}
//			System.out.println(sum);
//	for(int i = 100 ; i >0 ; i--) {
//		System.out.println(i);
//	}
//	int t= 46;
//	for(int i = 0; i<= 10; i++ ) {
//		System.out.println(t*i);
//	}
		
	//	for (int i = 0 ; ;i=i+100 ) {
	//		System.out.println(i); 
	//	}
//	     for( ; ; ) {
//		System.out.println("hello world");
//	}
	Scanner sc = new Scanner(System.in);
	int factorial = 1;
	int n = sc.nextInt() ;
	for(int i = 1 ; i <=n;i++) {
		factorial = factorial * i;
	}
	System.out.println(factorial);
	
	}

	}


