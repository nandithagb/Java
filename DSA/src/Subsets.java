
public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset("","abc");
		ascii("","abc");

	}
	static void subset(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch= up.charAt(0);
		subset(p+ch,up.substring(1));
		subset(p,up.substring(1));
	}
	static void ascii(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch= up.charAt(0);
		ascii(p+ch,up.substring(1));
		ascii(p,up.substring(1));
		ascii(p+(ch+0),up.substring(1));
	}

}
