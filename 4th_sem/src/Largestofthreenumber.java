import java.util.*;

public class Largestofthreenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c))
        {
        	System.out.println(a+" is the largest number ");
        }
        else if((b>a)&&(b>c))
        {
        	System.out.println(b+" is the largest number ");
        }
        else
        {
        	System.out.println(c+" is the largest number ");
        }
        
	}

}
