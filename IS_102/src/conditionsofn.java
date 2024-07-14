import java.util.*;
public class conditionsofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("eter the number of elements");
		n=sc.nextInt();
		
		int j=0,first_digit=0;
		int a[]=new int[n];
		int b[]=new int[n];
		if(n%2==0) {
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			while(a[i]>0)
			{
				first_digit=a[i]%10;
				a[i]/=10;
			}
			b[j]=first_digit;
			j++;
		}
		
		

	}

}
