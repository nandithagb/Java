
public class Length_of_string_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "NAnditha";
System.out.println(reclen(s));
	}
	static int reclen(String s) {
		if(s.length()==0) {
			return 0;
		}
		return reclen(s.substring(1))+1;
	}

}
