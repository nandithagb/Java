package daa_102;
import java.util.*;

public class merge {
      void merge(int arr[],int l,int m,int r)
      {
    	  int n1=m-l+1;
    	  int n2=r-m;
    	  int L[]=new int[n1];
    	  int R[]=new int[n2];
    	  for(int i=0;i<n1;i++)
    	  {
    		  L[i]=arr[l+i];
    	  }
    	  for(int j=0;j<n2;j++)
    	  {
    		  R[j]=arr[m+1+j];
    	  }
    	  int i=0,j=0;
    	  int k=l;
    	  while(i<n1&&j<n2)
    	  {
    		  if(L[i]<=R[j])
    		  {
    			  arr[k]=L[i];
    			  i++;
    		  }
    		  else
    		  {
    			  arr[k]=R[j];
    			  j++;
    		  }
    		  k++;
    	  }
    		  while(i<n1)
    		  {
    			  arr[k]=L[i];
    			  i++;
    			  k++;
    		  }
    		  while(j<n2)
    		  {
    			  arr[k]=R[j];
    			  j++;
    			  k++;
    		  }
    	  }
    	  void sort(int arr[],int l,int r)
    	  {
    		  if(l<r)
    		  {
    			  int m=(l+r)/2;
    			  sort(arr,l,m);
    			  sort(arr,m+1,r);
    			  merge(arr,l,m,r);
    		  }
    	  }
    	  static void printArray(int arr[])
    	  {
    		  int n=arr.length;
    		  for(int i=0;i<n;i++)
    		  {
    			  System.out.println(arr[i]+"");
    		  }
    		  System.out.println();
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
    			printArray(a);
    			merge ob=new merge();
    			s=System.nanoTime();
    			ob.sort(a,0,a.length-1);
    			e=System.nanoTime();
    			System.out.println("elements after sort");
    			printArray(a);
    			System.out.println("the time taken is "+(e-s));
    			
    		
      }
}
