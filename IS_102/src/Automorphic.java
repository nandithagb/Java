import java.util.*;

public class Automorphic {
	public static boolean automorphic(int n)
	{
		int x=n*n;
	       while(n>0)
	       {
	    	  if(n%10!=x%10)
	    	  
	    		  return false;
	    	  
	    	  n=n/10;
	    	  x=x/10;
	    
	       }
	 	  return true; 
	       
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n,x;
       System.out.println("enter the number to check wheteher the number is automorphic or not");
       n=sc.nextInt();
       System.out.println(automorphic(n)?"Automorphic":"NOT a automorphic");
       
	}

}
