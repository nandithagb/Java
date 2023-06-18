import java.util.Scanner;

public class kth_smallest {

	public static void main(String[] args) {
	
				// TODO Auto-generated method stub
				Scanner sc=new Scanner (System.in);
				int k,n,min;
				System.out.println("enter the k value");
				k=sc.nextInt();
				System.out.println("enter the number of array elements");
				n=sc.nextInt();
				int a[]=new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++)
				{
					System.out.println(+a[i]+"\t");
				}
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
						int temp;temp=a[i];
						a[i]=a[min];
						a[min]=temp;
					}
					
				}
				System.out.println("after sorting");
				
				for(int i=0;i<n;i++)
				{
					System.out.println( +a[i]+"\t");
				}
				System.out.println("the kth smallest element is "+a[k-1]);
				

			}

		}



