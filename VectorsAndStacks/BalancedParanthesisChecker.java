package VectorsAndStacks;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BalancedParanthesisChecker {

	public static void main(String[] args) {
		int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    for(int k=0;k<t;k++){
	        String h=sc.next();
	        check(h); 
	    }

	}
	
	
	public static void check(String s){
	    Stack<Character> stack=new Stack<>();
	    int l=s.length();char t=' ';int g=1;
	     
	    for(int i=0;i<l;i++){
	       
	        
	        if((s.charAt(i)=='(')||(s.charAt(i)=='{')||(s.charAt(i)=='[')){
	            stack.push(s.charAt(i));
	             
	        }
	        else{ 
	            if(stack.isEmpty()){
	                System.out.println("not balanced"); 
	             g=0;
	             break;
	            }
	            else
	            t=stack.peek();
	            if(pair(t,s.charAt(i))){
	                stack.pop();
	            }
	            else {System.out.println("not balanced"); 
	             g=0;
	             break;
	            }
	            
	        }
	    }
	    if(g==1){
	    if(stack.isEmpty()){
	        System.out.println("balanced");
	    }
	    else{
	        System.out.println("not balanced");
	    }}
	}
	public static boolean pair(char a,char t){
	      if(a=='('){
	          if(t==')'){
	              return true;
	          }
	         else return false;
	      }
	      else if(a=='{'){
	          if(t=='}'){
	              return true;
	          }
	         else return false;
	      }
	      else if(a=='['){
	          if(t==']'){
	              return true;
	          }
	         else return false;
	      }
	      
	      return false;
	}
	

}
