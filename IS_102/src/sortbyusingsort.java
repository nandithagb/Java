import java.util.*;
public class sortbyusingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("the numbers after sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}

	}

}
