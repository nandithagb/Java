import java.util.*;

public class matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int m,n,i,j,p,q;int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    System.out.println("enter the rows of matrix of a");
    m=sc.nextInt();
    System.out.println("enter the colomns of matrix of a");
    n=sc.nextInt();
    System.out.println("enter the rows of matrix of b");
    p=sc.nextInt();
    System.out.println("enter the colomns of matrix of b");
    q=sc.nextInt();
    System.out.println("the matrix a elements are");
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
    	{
    		a[i][j]=sc.nextInt();
    	}
    }
    System.out.println("the matrix b elements are");
    for(i=0;i<p;i++)
    {
    	for(j=0;j<q;j++)
    	{
    		b[i][j]=sc.nextInt();
    	}
    }
    if(n!=p)
    {
    	System.out.println("matrix multiplication is impossible");
    }
    else
    {
    	for(i=0;i<m;i++)
    	{
    		for(j=0;j<q;j++)
    		{
    			for(int k=0;k<n;k++)
    			{
    				c[i][j]+=a[i][k]*b[k][j];
    			}
    		}
    	}
    	System.out.println("the multiplication of matrix is ");
    	 for(i=0;i<m;i++)
    	    {
    	    	for(j=0;j<q;j++)
    	    	{
    	    		System.out.print(+c[i][j]+"\t");
    	    	}
    	    	System.out.println("\n");
    	    }
    	
    }
    
    
	}

}
