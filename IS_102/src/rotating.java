import java.util.Scanner;
public class rotating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of elements in the array");
       int n,i;
       n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("the elements in the array are");
       for(i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       }
       int k;
       System.out.println("enter the number of elements should rotate");
       k=sc.nextInt();
       k=k%n;
       for(i=0;i<n;i++)
       {
    	   if(i<k)
    	   {
    		   System.out.print(" "+a[n+i-k]);
    	   }
    	   else
    	   {
    		   System.out.print(""+a[i-k]);
    	   }
       }
       
	}

}
