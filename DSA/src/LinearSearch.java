
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		int target=3;
		System.out.println(search(arr,target,0));
		System.out.println(sea(arr,target,0));

	}
	static boolean search(int[] arr,int target,int n) {
		if(n==arr.length) {
			return false;
		}
		return arr[n]==target || search(arr,target,n+1);
	}
	static int sea(int []arr,int target,int n) {
		if(n==arr.length) {
			return -1;
		}
		if(arr[n]==target) {
			return n;
		}
		return sea(arr,target,n+1);
	}

}
