import java.util.*;
public class input_0_till_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number");
		while(true) {
			int n=sc.nextInt();
			if(n==0) {
				
				break;
			}
			else {
				sum+=n;
			}
		}
System.out.println("the sum of all numbers is"+sum);
	}

}
