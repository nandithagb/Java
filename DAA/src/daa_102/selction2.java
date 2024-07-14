
package daa_102;
import java.util.*;
public class selction2 {
	public static void selectsort(int[]arr){
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt(100);
		}
		System.out.println("before: ");
		selectsort(a);
		long s=System.nanoTime();
		selectsort(a);
		long e=System.nanoTime();
		System.out.println("After: ");
		selectsort(a);
		System.out.println("time taken: "+(e-s)+"ns");

	}

}