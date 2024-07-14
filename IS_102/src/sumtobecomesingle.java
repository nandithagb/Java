import java.util.*;
public class sumtobecomesingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("enter the number");
     n=sc.nextInt();
     int sum=0;
     while(n>0||sum>9)
     {
    	 if(n==0)
    	 {
    		 sum=0;
    	 }
    	 sum=+n%10;
    	 n=n/10;
    	 
     }
     System.out.println(sum);
	}

}
