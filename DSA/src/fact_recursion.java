
public class fact_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=fact(5);
System.out.println(x);
	}
static int fact(int n) {
	int factorial=1;
	if(n==1) {
		return 1;
	}
	
	return n*fact(n-1);
}
}
