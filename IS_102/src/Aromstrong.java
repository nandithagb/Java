import java.util.Scanner;
public class Aromstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,temp,count=0,sum=0,rem;
		System.out.println("enter the number to check the aromstrong");
		n=sc.nextInt();
		temp=n;
	    while(temp!=0)
		{
			temp/=10;
			count++;
		}
	    temp=n;
	    System.out.println(count);
	    System.out.println(n);
		while(temp!=0)
		{
			rem=temp%10;
			sum+=Math.pow(rem, count);
			
			temp/=10;
		}
		System.out.println(sum);
		if(n!=sum)
		{
			System.out.println("the number is  not an aromstrong");
		}
		else
		{
			System.out.println("the number is  an aromstrong");
		}
		

	}

}
