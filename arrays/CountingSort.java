package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the array size and array elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[100];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		
        Arrays.fill(b,0);
        int c[]=new int[n];
		
        Arrays.fill(c,0);
        
        
        for(int i=0;i<n;i++) {
        	b[a[i]]++;//counting
        }
        for(int i=1;i<100;i++) {
        	b[i]=b[i]+b[i-1];
        }
        
        for(int i=99;i>=1;i--) {
        	b[i]=b[i-1];
        }
        b[0]=0;
        //all starting positions are stored in b now
        for(int i=0;i<n;i++) {
        	c[b[a[i]]]=a[i];
        	b[a[i]]++;
        }
        
        for(int i=0;i<n;i++) {
        	System.out.print(c[i]+" ");
        }
	}

}
