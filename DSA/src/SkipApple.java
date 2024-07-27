
public class SkipApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "abbcdappnmhfg";
System.out.println(skipAppNotAPPle(str));
	}
	static String skip(String up) {
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("apple")) {
			return skip(up.substring(5));
		}
		else {
			return up.charAt(0) +skip(up.substring(1));
		}
	}
	static String skipAppNotAPPle(String up) {
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("app")&&!up.startsWith("apple")) {
			return skipAppNotAPPle(up.substring(5));
		}
		else {
			return up.charAt(0) +skipAppNotAPPle(up.substring(1));
		}
	}

}
