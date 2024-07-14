import java.util.*;
public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String s=sc.nextLine();
int left=0;
int right=s.length()-1;
boolean ispalindrome=true;
while(left<right) {
	if(s.charAt(left)!=s.charAt(right)) {
		ispalindrome=false;
		break;
	}
	
	left++;
	right--;
	
}
if(ispalindrome) {
	System.out.println("the string iss  a palindrome");
}
else {
	System.out.println("the string iss not   a palindrome");
}

	}

}
