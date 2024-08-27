package Accenture;
import java.util.*;
public class Product_Smallest_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of elements");
		Scanner sc= new Scanner(System.in);
		int n;
		
		n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum= sc.nextInt();
		int y =def_smallest(sum,a);
		System.out.println(y);
	}
	static int def_smallest(int sum,int a[]) {
		Arrays.sort(a);
		int check=a[0]+a[1];
		if(check<=sum) {
			return a[0]*a[1];
		}else
		
		return 0;
		
	}

}
