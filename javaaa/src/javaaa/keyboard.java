
package javaaa;
import java.util.*;
public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("start");
		String s= sc.nextLine();
		String output="";
		s=s.toUpperCase();
		System.out.println(s);
		String[] arr= {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","8","88","888","9","99","999"};
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				output=output+"0";
			}else if(ch>='A'&& ch<='Z'){
				int in=ch-'A';
				output=output+arr[in];
			}
			
		}
		System.out.println(output);
	

	}

}