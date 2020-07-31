package InterviewQuestions;

import java.util.Scanner;

public class MultiplyingStringBits {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s1=sc.next();
		    String s2=sc.next();
		    System.out.println(mul(s1,s2));
		}
	}
	public static int mul(String s1,String s2){
	    int m1=0;int m2=0;
	    int j=0;
	    for(int i=s1.length()-1;i>=0&&j<s1.length();i--){
	        int c=(int)(s1.charAt(i)-'0');
	        m1=m1+c*(int)Math.pow(2,j);
	        j++;
	    } j=0;
	    for(int i=s2.length()-1;i>=0&&j<s2.length();i--){
	        int c=(int)(s2.charAt(i)-'0');
	        m2=m2+(int)c*(int)Math.pow(2,j);
	        j++;
	    }
	    return m1*m2;
	}
}
