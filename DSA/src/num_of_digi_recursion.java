
public class num_of_digi_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= sum_digit(1342);
System.out.println(x);
	}
	static int sum_digit(int n) {
		if(n<=0) {
			return 0;
		}
		return sum_digit(n/10)+(n%10);
	}

}
