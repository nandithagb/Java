import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n;
    int i,rem=0,rev=0;
    n=sc.nextInt();
    while(n>0)
    {
    	rem=n%10;
    	rev=rem+(rev*10);
    	n=n/10;
    }
    System.out.println("reverse="+rev);
    
	}

}
