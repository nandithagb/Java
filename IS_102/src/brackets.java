import java.util.*;
public class brackets {
static void bracket(String exp,int n)
{
	int left=1;
	Stack<Integer>right=new Stack<Integer>();
	for(int i=0;i<n;i++)
	{
		if(exp.charAt(i)=='(')
		{
			System.out.print(left+" ");
			right.push(left);
			left++;
		}
		else if(exp.charAt(i)==')')
		{
			System.out.print(right.peek()+" ");
			right.pop();
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String exp=sc.nextLine();
int n=exp.length();
bracket(exp,n);
	}

}
