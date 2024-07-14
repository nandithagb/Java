package exam;
import java.util.Scanner;
import java.lang.Math;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,rpart,root1,root2;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a==0)
		{
			System.out.println("invalid entry");
		}
		else
		{
			double d=(b*b)-(4*a*c);
			if(d==0)
			{
				root1=(-b)/(2*a);
				root2=root1;
				System.out.println("roots= "+root1+root1);
				System.out.println("roots are real and equal");
			}
			else if(d>0)
			{
				 root1= ((-b)+Math.sqrt(d)/(2*a));
				 root2=((-b)-Math.sqrt(d)/(2*a));
				
				System.out.println("roots= "+root1+root2);
				System.out.println("roots are real and distinct");
			}
			else
			{
				rpart=(-b)/(2*a);
				double ipart=(Math.sqrt(-d)/(2*a));
				System.out.println("root1="+rpart+"+"+"i"+"+"+ipart);
				System.out.println("root2="+rpart+"+"+"i"+"+"+ipart);
				System.out.println("roots are imaginary");
			}
		    }

	}

}
