import java.util.*;
public class onearray_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("the elements in the one array is");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("the elements copying from one array to other array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]+"\t");
		}
		

	}

}
