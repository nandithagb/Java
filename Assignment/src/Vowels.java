import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
	System.out.println("vowel");
}
else {
	System.out.println("consonant");
}
	}

}
