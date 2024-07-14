import java.util.*;
public class promax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s,i,max,n1=0,n2=0;
           Scanner sc=new Scanner(System.in);
           n=sc.nextInt();
           int a[]=new int[n];
           int pro[]=new int[n];
           System.out.println("the elemenets are");
           for(i=0;i<n;i++)
           {
        	   a[i]=sc.nextInt();
           }
           System.out.println("the product of elements are");
           for(i=0;i<n-1;i++)
           {
        	   pro[i]=a[i]*a[i+1];
        	   System.out.print(pro[i]+"\t");
           }
           System.out.println("\n");
           max=pro[0];
           for(i=0;i<n-1;i++)
           {
        	   if(pro[i]<pro[i+1])
        	   {
        		   max=pro[i+1];
        		  n1=a[i+1];
        		  n2=a[i+2];
        	   }
        	  
           }
           System.out.print(n1+"\t");
           System.out.print(n2+"\t");
           
           
           
	}

}
