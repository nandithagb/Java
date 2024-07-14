import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the number to find factorial");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
