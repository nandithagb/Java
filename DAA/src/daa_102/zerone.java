package daa_102;
import java.util.Scanner;
public class zerone {
   public static int knapsack(int weights[],int values[],int capacity)
   {
       int n=weights.length;
       int dp[][]=new int[n+1][capacity+1];
       for(int i=0;i<=n;i++)
       {
           for(int w=0;w<=capacity;w++)
           {
               if(i==0||w==0)
               {
                   dp[i][w]=0;
               }
               else if(weights[i-1]<=w)
               {
                   dp[i][w]=Math.max(values[i-1]+dp[i-1][w-weights[i-1]],dp[i-1][w]);
               }
               else {
                   dp[i][w]=dp[i-1][w];
               }
           }
       }
       return dp[n][capacity];
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the num of items");
       int n=sc.nextInt();

       int i;
       int values[] =new int[n];
       int weights[]=new int[n];
       System.out.println("enter the values");
       for(i=0;i<n;i++)
       {
           values[i]= sc.nextInt();
       }
       System.out.println("enter the weights");
       for(i=0;i<n;i++)
       {
           weights[i]= sc.nextInt();
       }
       System.out.println("enter the capacity");
       int max=sc.nextInt();
       int maxvalue=knapsack(weights,values,max);
       System.out.println("the max values profit is"+maxvalue);


   }
}