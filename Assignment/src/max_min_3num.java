import java.util.*;
public class max_min_3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		System.out.println("the maximum number among 3 is"+maximum( n1,n2, n3));
		System.out.println("the minimum number among 3 is"+minimum( n1,n2, n3));
	}
	static int maximum(int n1,int n2,int n3) {
		if(n1>n2) {
			if(n1>n3) {
				return n1;
			}
		}
		else {
			if(n2>n3) {
				return n2;
			}
		}
		return n3;
	}
	static int minimum(int n1,int n2,int n3) {
		if(n1<n2) {
			if(n1<n3) {
				return n1;
			}
		}
		else {
			if(n2<n3) {
				return n2;
			}
		}
		return n3;
	}

}
