package daa_102;
import java.util.*;
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,min;
		long start,end,diff;
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		Random r=new Random(100);
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt();	
		}
		System.out.println("array before sort is");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");	
		}
		start=System.nanoTime();
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}

			if(min!=i)
			{
				int temp;
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
	}
		end=System.nanoTime();
		diff=end-start;
		System.out.println("array after sort is");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");	
		}
	}

}
