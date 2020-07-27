package sets;

import java.util.*;

//this question was previously done on GkFoGks using two pointers algorithm
//given an array,find if there exists a subarray with sum 0;
public class Zerosumsubarray {

	public static void main(String[] args) {
		int a[]=new int[]{3,4,-1,4,3,-6,-7,2};
		int l=a.length;int c=0;
		/*for(int i=0;i<l;i++) {
			for(int j=i;j<l;j++) {
				int s=0;
				for(int k=i;k<=j;k++) {
					s=s+a[k];
				}
				if(s==0) {
					c++;
					System.out.println(a[i]+" "+i+" "+j);
				}
			}
		}*/
		//METHOD 2 BY PRESUM o(N^2);
		/*int presum[]=new int[l];
		presum[0]=a[0];
		for(int i=1;i<l;i++) {
			presum[i]=a[i]+presum[i-1];
		}
		for(int i=0;i<l;i++) {		
			for(int j=i;j<l;j++) {
				int s=0;
				if(presum[j]-presum[i]+a[i]==0) {
					System.out.println(a[i]+" "+i+" "+j);
					c++;
				}
			}
		}*/
		
		
		//or by Method 3
	/*	for(int i=0;i<l;i++) {
			int s=0;
			for(int j=i;j<l;j++) {
				s=s+a[j];
				if(s==0) {
					c++;
				}
			}
			
		}*/
		
		//by METHOD 4 time->O(n),space->o(n); using sets
		//just checking whether zero sum array exists or no
		int k=0;
		Set<Integer> p=new HashSet<>();
		int s=0;
         
		for(int i=0;i<l;i++) {
			p.add(s);
			s=s+a[i];
			if(p.contains(s-k)) {
			   System.out.println("Yes");
			   return ;
			   
			}
		}
		
		System.out.println("no");
		//System.out.println(c);

	}

}
