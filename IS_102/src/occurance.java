import java.util.Scanner;
public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char ch;
		int count=0;
		System.out.println("enetre the charactrer");
		ch= sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println(""+str+"="+count);
		
		

	}

}
