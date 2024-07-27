
public class unnique_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,1,2,3,4,3,2,4,6};
System.out.println(ans(arr));
	}
	static int ans(int [] arr) {
		int unique=0;
		for(int n:arr) {
			unique^=n;
		}
		return unique;
	}

}
