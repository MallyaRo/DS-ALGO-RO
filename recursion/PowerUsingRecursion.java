package recursion;

public class PowerUsingRecursion {

	public static void main(String[] args) {
		//a^b
		
		System.out.println(fastpow(2,10));
     
	}
	/*static int pow(int a ,int b) {
		if(b==0) {
			return 1; 
		}
		
		else return a*pow(a,b-1);
	}*/
	static int fastpow(int a ,int b) {
		System.out.println(b);
		if(b==0) {
			return 1;
		}
		else if(b%2==0) {
			 return fastpow(a*a,b/2);
		 }
		 else return a*fastpow(a,b-1);
	}

}
