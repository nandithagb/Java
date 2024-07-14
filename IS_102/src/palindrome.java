import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,rem,rev=0,num;
System.out.println("enter the number to check the palindrome");
num=sc.nextInt();
n=num;
while(n>0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
if(rev==num)
{
	System.out.println("the number is palindrome");
}
else
{
	System.out.println("the number is not an palindrome");
}
	}

}
