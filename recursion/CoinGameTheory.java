package recursion;

public class CoinGameTheory {

	public static void main(String[] args) {
		  int a[]= {2,5,7,3,};
		  System.out.println(coin(a,0,a.length-1));
          
	}
	
	static int coin(int a[],int l,int r) {
		if(l+1==r) {
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+Math.min(coin(a,l+2,r),coin(a,l+1,r-1)),a[r]+Math.min(coin(a,l+1,r-1),coin(a,l,r-2)));
	}

}
