package javaa;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n,sum=0;
         n=sc.nextInt();
         int a[] = new int[n];
         for (int i=0;i<n;i++)
         {
        	 a[i]=sc.nextInt();
        	 sum=sum+a[i];
         }
         int avg=sum/n;
         System.out.println("sum="+sum);
         System.out.println("avg="+avg);
         
	}

}
