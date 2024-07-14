package exam;
import java.util.Scanner;
public class Teacher implements Exp7 {
         String name,age,qual,ach;
         int exp;
       
         public void biodata()
         {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("enter your name");
        	 name=sc.next();
        	 System.out.println("enter your age");
        	 age=sc.next();
        	 System.out.println("enter your qual");
        	 qual=sc.next();
        	 System.out.println("enter your exp");
        	 exp=sc.nextInt();
        	 System.out.println("enter your achievements");
        	 ach=sc.next();
        	
        	 System.out.println("BIODATA");
        	 System.out.println("name"+name);
        	 System.out.println("age"+age);
        	 System.out.println("qualification"+qual);
        	 System.out.println("exprience"+exp);
        	 System.out.println("achievements"+ach);
        	
         }
}