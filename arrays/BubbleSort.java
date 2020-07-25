package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		System.out.println("enter the length of the array");
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println("enter the elements of the array a ");
		int[]a= new int[k];
		for(int i = 0 ; i<k;i++) {
			a[i]=sc.nextInt();
		}
		int n = a.length;
		//basically swapping elements
		for(int i = 0 ;i<n-1;i++) {
			//second last element swaps the last 
			boolean sorted = true; 
			for (int j = 0 ;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j]=temp;
					sorted = false;
					}}
		if(sorted)break;	
		}	
		
        for(int item: a) {
        	//enhanced for loop
        	System.out.print(item +" ");}
        
	}

}
