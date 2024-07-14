import java.util.*;
public class convertarraytonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,res=0;
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("elements in the array are");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			res=res*10+a[i];
		}
		System.out.println(res);
		

	}

}
