package exam;
import java.util.Scanner;
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		n=sc.nextInt();
		Secondclass s[]=new Secondclass[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Secondclass();
			System.out.println("enter name");
			s[i].name=sc.next();
			System.out.println("enter usn");
			s[i].USN=sc.next();
			System.out.println("enter branch");
			s[i].branch=sc.next();
			System.out.println("enter phone");
			s[i].phno=sc.nextInt();
			
		}
		System.out.println("\tUSN\tName\tBranch\tContact");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
		

	}

}
