
public class way_2_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=reverse(12345);
System.out.println(x);
	}
	static int reverse (int n) {
		int digits= (int)(Math.log10(n))+1;
		return helper(n,digits);
	}
	static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10, digits-1)) +helper(n/10,digits-1);
	}

}
