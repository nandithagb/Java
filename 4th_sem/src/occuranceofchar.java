import java.util.*;
public class occuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		char ch;
		int i,count=0,space=0;
		System.out.println("enter the string name");
		name=sc.nextLine();
		System.out.println("enter the charcter name");
		ch=sc.next().charAt(0);
		for(i=0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				count++;
			}
			else if(ch==' ')
			{
				space++;
			}
		}
		System.out.println("count="+count);
		System.out.println("space="+space);

	}

}
