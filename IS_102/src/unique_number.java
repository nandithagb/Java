import java.util.*;
public class unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n;int flag=0;
		System.out.println("enter the number");
		n=sc.next();
		for(int i=0;i<n.length();i++)
		{
			for(int j=i+1;j<n.length();j++)
			{
				if(n.charAt(i)==n.charAt(j))
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("unique number");
		}
		else
		{
			System.out.println("not a unique number");
		}
		
		

	}

}
