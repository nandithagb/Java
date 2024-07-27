
public class fibo_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
int x=fibo(7);
System.out.println(x);
	}
	static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
