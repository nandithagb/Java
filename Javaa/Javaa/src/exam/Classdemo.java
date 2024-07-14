package exam;

import java.util.Scanner;

public class Classdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int choice;
        Scanner sc=new Scanner(System.in);
        while(5>2)
        {
        	System.out.println("1.TEACHER\n2.STUDENT\n3.EXIT");
        	System.out.println("enter the choice");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		Teacher t=new Teacher();
        		t.biodata();
        		break;
        	case 2:
        		Student s=new Student();
        		s.biodata();
        		break;
        	case 3:
        		System.exit(0);
        		break;
        		default:
        			System.out.println("invalid choice");
        	}
        } 
	}

}
