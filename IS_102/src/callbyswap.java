import java.util.*;

public class callbyswap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n1,n2;
  callbyswap s= new callbyswap();
  n1=sc.nextInt();
  n2=sc.nextInt();
  s.swap(n1,n2);

	}
	public void swap(int x,int y) {
		 int temp;
		 temp=x;
		 x=y;
		 y=temp;
		  System.out.println("n1= "+x+"\t"+"n2= "+y);
	}

}
