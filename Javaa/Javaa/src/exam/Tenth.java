package exam;
import java.util.Scanner;
public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a,b,result;
			Scanner sc =new Scanner(System.in);
			System.out.println("ENTER THE FIRST NUMBER:");
			a=sc.nextInt();
			System.out.println("ENTER THE SECOND NUMBER:");
			b=sc.nextInt();
			if(b==0)
			{
				System.out.println("invalid entry");
			}
			try {
				 result=a/b;
				System.out.println("RESULT:"+result);
					
			}
			catch(ArithmeticException ex){
				System.out.println("exception caught:Divide by zero"+ex);
				
			}
			

			}

		
	}


