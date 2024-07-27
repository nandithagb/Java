import java.util.*;
public class Sum_triangle_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		triangle(arr);

	}
	static void triangle(int []arr) {
		if(arr.length<=1) {
			return;
		}
		int[] ar= new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			int x=arr[i]+arr[i+1];
			ar[i]=x;
		}
	
		triangle(ar);
		System.out.println(Arrays.toString(ar));
		
	}

}
