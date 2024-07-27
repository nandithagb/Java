
public class prod_digi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= prod(1342);
System.out.println(x);
	}
	static int prod(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10 * prod(n/10);
	}

}
