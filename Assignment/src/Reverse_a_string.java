import java.util.*;
public class Reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder reversee= new StringBuilder();
		reversee.append(s);
		reversee.reverse();
		String reversestring=reversee.toString();
		System.out.println(reversestring);
		if(reversestring.equals(s)) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		

	}

}
