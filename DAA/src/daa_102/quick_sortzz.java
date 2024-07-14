
package daa_102;
import java.util.*;
public class quick_sortzz {
	public static int partition(int a[],int p,int n)
	{
		int x=a[n];
		int temp,j;
		int i=p-1;
		for(j=p;j<n;j++)
		{
			if(a[j]<=x)
			{
				i=i+1;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			temp=a[i+1];
			a[i+1]=a[n];
			a[n]=temp;
			return(i+1);
		}
	
		public static void qs(int a[],int p,int n)
		{
			int q;
			if(p<n)
			{
				q=partition(a,p,n);
				qs(a,p,q-1);
				qs(a,q+1,n);
			}
		}
	
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int a[],n,i,j;
		long s,e;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt(50000);
		}
		System.out.println("elements before sort");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		System.out.println("\n");
		s=System.nanoTime();
		qs(a,0,n-1);
		e=System.nanoTime();
		System.out.println("elements after sort");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		System.out.println("the time taken is "+(e-s));
		
	}

}