import java.util.*;
import java.io.*;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numebr upto fibonoic series u want");
        int n,n3;
        n=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1+"\t");
        System.out.print(n2+"\t");
        for(int i=2;i<n;i++)
        {
        	n3=n2+n1;
        	n1=n2;
        	n2=n3;
        	
        	System.out.print(n3+"\t");
        }
	}

}
