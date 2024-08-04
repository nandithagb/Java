import java.util.*;
public class Lexical_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr= subset("","abc");
		System.out.println(arr);
		

	}
	static ArrayList<String> subset(String p,String up) {
		if(up.length()==0) {
			ArrayList <String> list = new ArrayList<>();
			
			list.add(p);
			
			return list;
		}
		ArrayList <String> list = new ArrayList<>();
		list.addAll(subset(p+up.charAt(0),up.substring(1)));
		list.addAll(subset(p,up.substring(1)));
		return list;
	}

}
