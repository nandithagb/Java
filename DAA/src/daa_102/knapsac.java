package daa_102;
import java.util.*;
public class knapsac
{
    static int t[][];
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,max,i,j;
        System.out.println("Enter n:");
        n=in.nextInt();
        
        int wt[]=new int[n];
        int val[]=new int[n];
        
        System.out.println("Enter weights and their corresponding values :");
        for(i=0;i<n;i++)
        {
            wt[i]=in.nextInt();
            val[i]=in.nextInt();
        }
        
        System.out.println("Enter maximum weight :");
        max=in.nextInt();
        
        t=new int[n+1][max+1];
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=max;j++)
            {
                t[i][j]=-1;
            }
        }
        
        ks(t,wt,val,n,max);
        
        System.out.println("Matrix :");
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=max;j++)
            {
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("Maximum Profit :"+t[n][max]);
    }
    
    public static int ks(int t[][],int wt[],int val[],int n,int max)
    {
        if(n==0 || max==0)
        {
            return 0;
        }
        if(t[n][max]!=-1)
        {
            return t[n][max]; 
        }
        if(wt[n-1]<=max)
        {
            t[n][max]=Math.max((val[n-1]+ks(t,wt,val,n-1,max-wt[n-1])),ks(t,wt,val,n-1,max));
        }
        if(wt[n-1]>max)
        {
            t[n][max]=ks(t,wt,val,n-1,max);
        }
        return t[n][max];
    }
}
