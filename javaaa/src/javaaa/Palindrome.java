package javaaa;
import java .util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		boolean ispali=true;
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++) {
			char start=s.charAt(i);
			char end=s.charAt(s.length()-1-i);
			if(start!=end) {
				System.out.println("not a palindrome");
				ispali=false;
				break;
			}
		}
	if(ispali) {
		System.out.println("palindrome");
	}
	}
	

}
