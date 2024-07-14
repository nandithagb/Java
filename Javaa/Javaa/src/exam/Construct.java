package exam;
import java.util.Scanner;

class sum
{
	int s;
	
	sum()
	{ 
		System.out.print("Sum is:");
	}
	
	sum(int a, int b)
	{ 
		s = a + b;
	}
	
	void display() 
	{
		System.out.print(s);
	}
}

public class Construct
{
public static void main(String args[]) 
{
	int a, b;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers:");
	a = sc.nextInt();
	b = sc.nextInt();
	sum t1 = new sum(a,b);
	t1.display();
}
}