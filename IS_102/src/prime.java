import java.util.*;

public class prime {
	public static void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			if(count<2)
			{
				System.out.println(n);
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
int n,count=0,i;
System.out.println("enter the number");
n=sc.nextInt();

for(i=1;i<=n;i++)
{
	prime(i);
}

	}

}
