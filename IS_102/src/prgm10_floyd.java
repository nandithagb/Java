import java.util.*;
public class prgm10_floyd
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,k,INF=99999;
        System.out.println("Enter number of vertices :");
        n=in.nextInt();
        
        int a[][]=new int[n][n];
        System.out.println("Enter adjacency matrix :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                if(a[i][j]==-1)
                {
                    a[i][j]=INF;
                }
            }
        }
        
        for(k=0;k<n;k++)
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=Math.min(a[i][k]+a[k][j],a[i][j]);
                }
            }
        }
        
        System.out.println("Shortest Path :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
