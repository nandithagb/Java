package javaa;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
       str=sc.nextLine();
       String reverse="";
       for(int i=0;i<str.length();i++) {
    	   reverse=str.charAt(i)+reverse;
    	   
       }
       System.out.println("reverse="+reverse);
    	   
        
        
	}

}
