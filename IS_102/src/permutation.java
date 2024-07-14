import java.util.*;
public class permutation {
	 static void print(String x,String res)
		{
            if(x.length()==0)
            {
            	System.out.println(res+" ");
            	return;
            }
           for(int i=0;i<x.length();i++)
           {
        	   char ch=x.charAt(i);
        	   String ror=x.substring(0, i) +
                       x.substring(i + 1);
        	   print(ror,res+ch);
           }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.next();
		permutation p=new permutation();
		p.print(s,"");
		
	}

}
