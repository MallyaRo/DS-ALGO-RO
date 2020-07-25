package strings;

import java.util.Scanner;

public class ReversingAStringWordByWord {
    //reversing the string word by word
	public static void main(String[] args) {
		String s="",s1,temp;
		char c;
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s1=s1.trim();
	   for(int i=0;i<s1.length();i++) {
		   if(s1.charAt(i)==' '&&s1.charAt(i+1)==' ') {
			   continue;
		   }
		   else {
			   s=s+s1.charAt(i);
			   
		   }
	   }
	   
		String f[]=s.split(" ");
		int l=0;
		for(String ss:f) {
			l++;
		}
		for(int i=0;i<l/2;i++) {
			temp=f[i];
			f[i]=f[l-i-1];
			f[l-i-1]=temp;
		}
		for(String ss:f) {
			System.out.print(ss+" ");
		}
		

	}

}
