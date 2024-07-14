import java.util.Scanner;


public class Perfectnumber {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,i,t=0;
		System.out.println("enter the number to check the perfect number");
		num=sc.nextInt();
		for(i=1;i<num;i++) {
			if(i*i==num)
			{
				
				t=t+1;
			}
		}
		if(t==1)
		{
			System.out.println("the number is perfect square number");
		}
		else
		{
			System.out.println("the number is not perfect square number");
		}
		

	}
	

}
