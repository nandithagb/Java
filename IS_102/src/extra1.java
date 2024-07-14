import java.util.*;
public class extra1 {
      public static boolean prime(int a)
      {
    	  int count=0;
    	  for(int i=1;i<a;i++)
    	  {
    		  if(a%i==0)
    		  {
    			  count++;
    		  }  
    	  }
    	  if(count<2)
		  {
    		 return true;
		  }
    	  else
    	  {
    		  return false;
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		int n1=sc.nextInt();
		System.out.println("enter the number 2");
		int n2=sc.nextInt();
		for(int i=n1;i<n2;i++)
		{
			prime(i);
		}
		
	}

}
