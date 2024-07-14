import java.util.Scanner;
public class intermediate_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n,i,mid;
        System.out.println("enter the number of elements in the array");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("the elements in thae array is");
        for(i=0;i<n;i++)
        {
        	System.out.print(+a[i]+"\t");
        }
        mid=n/2;
        System.out.println("the array traversal is");
        System.out.print(""+a[mid]+"->");
       
        for(i=1;i<=mid+1;i++)
        {
        	 System.out.print(""+a[mid-i]+"->");
        	 System.out.print(""+a[mid+i]+"->");
        	
        }
	}

}
