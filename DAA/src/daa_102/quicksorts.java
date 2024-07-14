package daa_102;
import java.util.*;
public class quicksorts {
	public static int partition(int a[],int p,int r) {
		int key=a[r];
		int j=p-1;
		for(int i=p;i<r;i++)
		{
			if(a[i]<=key) {
				j++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		int temp2=a[j+1];
		a[j+1]=a[r];
		a[r]=temp2;
		return j+1;
	}
	public static void quicksort(int a[],int p,int r)
	{
		if(p<r)
		{
			int j=partition(a,p,r);
			quicksort(a,p,j-1);
			quicksort(a,j+1,r);
		}
	}
	public static void main(String args[])
	{
		
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
		quicksort(a,0,n-1);
		e=System.nanoTime();
		System.out.println("elements after sort");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		System.out.println("the time taken is "+(e-s));
}
}