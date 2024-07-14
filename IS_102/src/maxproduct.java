import java.util.*;
public class maxproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
int  max;
System.out.println("enter the number of elements");
n=sc.nextInt();
int a[]=new int[n];
for (int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
Arrays.sort(a);
 max=a[n-1]*a[n-2];
	System.out.println("the maximum product is"+max);
	}

}
