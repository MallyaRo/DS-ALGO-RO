package arrays;

import java.util.Scanner;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Rohan enter the length of the array!");
		
		
		System.out.println("enter the length of the array!");
		int n = sc.nextInt();
		int[] a  = new int[n];
		System.out.println("Enter the elements of the array:");
		System.out.println();
		for(int i =0; i<n ;i++) {
			a[i]= sc.nextInt();
		}
		// by kadens algorithm
		
		int max = Integer.MIN_VALUE;
		int curSum=0;
		for(int i =0; i <n ; i++) {
			curSum += a[i];
			if (curSum> max) {
             max = curSum;	}
			if (curSum<0 ) {
				curSum=0;
			}
		}
		System.out.println(max );
		
		
		// method 2 by pre processing
//			int presum []= new int [n];
//			presum[0]= a[0];
//			for(int i = 1;i<n ;i++) {
//				presum[i]=presum[i-1]+a[i];
//				
//			}
//			int max = Integer.MIN_VALUE;
//			
//			for(int i=0;i<n;i++) {
//				for(int j = i; j<n ; j++) {
//					//int sum = 0;
//					//for (int k = i ; k<=j;k++) {
//					//	sum+= a[k];
//					int sum= presum [j]-presum [i]+ a[i];
//					//}
//					if(sum > max) {
//						max = sum;}   
//				
//	}
		//}
		//System.out.println("the maximum sum of the array is " + max);

	}

}
