
public class nto1_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);

	}
	static void fun(int n) {
		if(n==1) {
			System.out.println("1");
			return ;
		}
		
		
		System.out.println(n);
		fun(n-1);
	}

}
