import java.util.*;
public class twinprime {
static boolean checkPrime(int n)
{
	int i,count=0;
	for(i=2;i*i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
		
	}
	return true;
	
}
static boolean checkTwinPrime(int n1,int n2)
{
	if(checkPrime(n1) && checkPrime(n2) && (Math.abs(n2-n1)==2))
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
		int n1,n2,count=0;
		System.out.println("enter the starting element");
		n1=sc.nextInt();
		System.out.println("enter the last element");
		n2=sc.nextInt();
		for(int i=n1;i<n2;i++)
		{
			if (checkTwinPrime(i,(i+2)))
			{
				System.out.printf("%d,%d\n",i,i+2);
			}
		}
	
		
	
		

	}

}
