import java.util.*;
public class special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num,rem,sum=0,n;
n=sc.nextInt();
num=n;
while(num>0)
{
	rem=num%10;
	
	int fact=1;
	for(int i=1;i<=rem;i++)
	{
		fact=fact*i;
	}
	sum=sum+fact;
	num=num/10;
}
if(sum==n)
{
	System.out.println("the number is special number");
}
else
{
	System.out.println("the number is not a special number");
}
	}

}
