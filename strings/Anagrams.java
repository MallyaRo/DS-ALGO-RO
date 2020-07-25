package strings;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 2 strings one by one :");
		System.out.println();
		String s1 = sc.next();
		String s2= sc.next();
		int[]a= new int[256];
		//int[]b=new int[256];
		for(int i=0;i<256;i++) {
			a[i]=0;
			//b[i]=0;
		}
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2) {
			System.out.println("They are not anagrams.");
			System.exit(0);
		}
		for(int i=0;i<l1;i++) {
			int l=(int)s1.charAt(i);
			a[l]++;
		}   
		for(int i=0;i<l2;i++) {
			int l=(int)s2.charAt(i);
			if(a[l]>0) {
			a[l]--;}
		} 
		for(int i=0;i<256;i++) {
			if(a[i]==0) {
				continue;
			}
			else {
				System.out.println("They are not anagrams");
				System.exit(0);
			}
		}
		System.out.println("They are anagrams");
    // we can also sort the array and compare
	}

	

}
