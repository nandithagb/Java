package javaa;
import java.util.Scanner;
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n,firstTerm=0,secondTerm=1;
     n=sc.nextInt();
     System.out.println("Fibonacci Series till " + n + " terms:");

     for (int i = 1; i <= n; ++i) {
       System.out.println(firstTerm);

       // compute the next term
       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
     
	}
	}
}
