package recursion;

public class SumOfNos {

	public static void main(String[] args) {
		int i=9;
		System.out.println(sum(i));

	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else return sum(n-1)+n;
	}

}
