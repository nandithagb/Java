import java.util.*;

public class collectionreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("the numbers after sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}

	}

}
