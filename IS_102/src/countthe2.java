import java.util.*;
public class countthe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem,temp,count=0;
		System.out.println("enter the number");
		temp=sc.nextInt();
		n=temp;
		while(n>0)
		{
			rem=n%10;
			n=n/10;	
			if(rem==2)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
