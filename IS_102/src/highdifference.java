import java.util.*;
public class highdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,max=0,diff,n1=0,n2=0;
		System.out.println("enter the number of array elements");
		n=sc.nextInt();
		int a[]=new int[n];
		Integer x[]=new Integer[n];
		System.out.println("the numbers are");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
         Arrays.sort(a);
         System.out.println("the largest differenec is "+(a[n-1]-a[0]));
		System.out.println("the numbers are"+a[n-1]+"\t"+a[0]);
		

	}

}
