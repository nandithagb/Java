
public class Find_min_max_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		System.out.println(minium(arr,arr.length));
	}
	static int minium(int[] arr,int n) {
		if(n==1) {
			return arr[0];
		}
		return Math.min(arr[n-1], minium(arr,n-1));
	}

}
