import java.util.*;
public class fibnoccinthterm {
   public static int fibo(int n)
   {
	   if(n<=1)
	   {
		   return n;
	   }
	   else
	   {
		   return fibo(n-2)+fibo(n-1);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int res=fibo(n);
System.out.println(res);

	}

}
