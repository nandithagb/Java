package exam;
import java.util.Scanner;
public class Thiird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,count=0;
		System.out.println("enter the number to check prime");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count>=2)
		{
			System.out.println("not a prime");
		}
		else
		{
			System.out.println(" prime");
		}

	}

}
