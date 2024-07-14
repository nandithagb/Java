package exam;
import java.util.Scanner;

class add
{
	int s;
	
	void sum()
	{ 
		System.out.print("Sum is:");
	}
	void sum(int a, int b)
	{ 
		s = a + b;
	  
	}
	void display() 
	{
		System.out.print(s);
	}
}
public class Method
{
	public static void main(String args[]) 
	{
		int a, b;
		add s = new add();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		s.sum();
		s.sum(a,b);
		s.display();
		
	}
}