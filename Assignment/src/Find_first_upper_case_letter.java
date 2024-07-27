
public class Find_first_upper_case_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nanDitha";
		System.out.println(find(s));

	}
	/// iterative
	static char find(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return 0;
	}

}
