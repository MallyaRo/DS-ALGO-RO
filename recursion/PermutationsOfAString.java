package recursion;

import java.util.*;

public class PermutationsOfAString {
static  int x=0; 
 static Set <String> an=new HashSet<>();
	public static void main(String[] args) {
		String a ="ccba";
		 per(a,0,a.length()-1);
         System.out.println(an);
	}
	static void per(String s,int l,int r) {
		if(l==r) {
			//System.out.println(s);x++;
			an.add(s);
		}
		for(int i=l;i<=r;i++) {
			char ch[]=s.toCharArray();
			char temp= ch[i];
			ch[i]=ch[l];
			ch[l]=temp;
			String s1=new String(ch);
			per(s1,l+1,r);
			char ch1[]=s.toCharArray();
			 temp= ch1[i];
			ch1[i]=ch1[l];
			ch1[l]=temp;
			s1=new String(ch1);
		}
	}

}
