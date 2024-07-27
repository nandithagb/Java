
public class sum_of_n_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= sum(5);
System.out.println(x);
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

}
