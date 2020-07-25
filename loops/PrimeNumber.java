package loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    boolean x = true;
	
	for (int i = 2 ; i*i<= n; i++) {
		if (n % i == 0 ) {
			
			x= false;
			break;
			}
		
	}  if (n< 2) x = false;
	 
	System.out.println(n+ "is prime " + x);
	

	}

}
