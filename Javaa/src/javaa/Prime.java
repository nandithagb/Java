package javaa;
import java.util.Scanner;

public class Prime {
	static void mycode(int n)
	{
		int count=0;
		if(n<2)
		{
			System.out.println();
		}
		else
		{
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
				if(count<2)
				{
					System.out.println(n);
				}
				
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,count=0,n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(i=n1;i<=n2;i++)
		{
			mycode(i);
		}


	}

}
