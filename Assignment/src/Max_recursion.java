
public class Max_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		System.out.println(maximum(arr,arr.length));
	}
static int maximum(int []arr,int n) {
	if(n==1) {
		return arr[0];
	}
	return Math.max(arr[n-1], maximum(arr,n-1));
}
}
