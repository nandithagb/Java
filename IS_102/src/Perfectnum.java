import java.util.*;
public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n,i,x=0;
        System.out.println("enter the number to check perfect number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
        	if(n%i==0)
        	{
        		x=x+i;
        	}
        }
        if(x==n) {
        	System.out.println("the number is perfect number");
        }
        else
        {
        	System.out.println("the number is not perfect number");
        }
        
	}

}
