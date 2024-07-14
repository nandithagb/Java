import java.util.*;
public class replacinganumber {
	public static String replace(int x)
	{
		String temp  = x + "";
        return temp.replace('0','5');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number to replace 0's and 1's");
    int  n=sc.nextInt();
     System.out.println(replace(n));
	}

}
