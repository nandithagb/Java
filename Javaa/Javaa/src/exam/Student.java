package exam;
import java.util.Scanner;

public class Student implements Exp7{
	 String name,age,discipline;
     int res;
     public void biodata()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter your name");
    	 name=sc.next();
    	 System.out.println("enter your age");
    	 age=sc.next();
    	 System.out.println("enter your discipline");
    	 discipline=sc.next();
    	 System.out.println("enter your result");
    	 res=sc.nextInt();
    	 
    	 System.out.println("BIODATA");
    	 System.out.println("name"+name);
    	 System.out.println("age"+age);
    	 System.out.println("discipline"+discipline);
    	 System.out.println("result"+res);
    	
     }
}
