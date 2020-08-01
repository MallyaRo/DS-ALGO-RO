package Backtracking;

import java.util.*;

public class PartitioningAnArrayIntoEqualSumArray {
    ArrayList<Integer> l1=new ArrayList<>(); 
    ArrayList<Integer> l2=new ArrayList<>(); 
	public static void main(String[] args) {
	int a[]= {2,1,2,3,4,8};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	 ArrayList<Integer> l=new ArrayList<>();
	boolean ispossible =(sum%2==0 &&part(a,sum/2,0, l));//or sum&1==0
	 if(ispossible) {
		 for (int e:l) {
			 System.out.print(e+" ");
		 }
	 }
	 else System.out.println("Not Possible");
	
	
	}
	
	static boolean part(int a[],int sum,int i,ArrayList<Integer> l) {
		if(i>=a.length||sum<0)return false;
		if(sum==0) {
			return true;
		}
		
		l.add(a[i]);
		boolean leftpossible=part(a,sum-a[i],i+1,l);
		if(leftpossible)return true;
		//if we dont get answer from left side
		//this makes backtracking work
		l.remove(l.size()-1);
		return part(a,sum,i+1,l);
	}
	

}
