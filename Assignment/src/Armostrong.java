import java.util.*;
public class Armostrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			
			armstrong(i);
			
		}
		

	}
	static void armstrong(int x) {
		int sum=0;
		int temp=x;
		while(x>0) {
			int rem=x%10;
			sum+=Math.pow(rem, 3);
			x=x/10;
			
		}
		if(sum==temp) {
			System.out.println(temp);
		}
	}

}
