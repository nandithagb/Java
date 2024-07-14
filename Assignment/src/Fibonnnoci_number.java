import java.util.*;
public class Fibonnnoci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n-2;i++) {
			int sum=a+b;
			System.out.print(sum+" ");
			int temp=b;
				b=sum;
				a=temp;
		}

	}

}
