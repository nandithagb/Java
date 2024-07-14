import java.util.*;
public class duplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,count=0;
		System.out.println("enter the number of words");
		n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("the words are");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println("the duplicate word is"+a[j]);
				}
				
			}
			
		}
		System.out.println("the number of occurence are"+count);
	}

}
