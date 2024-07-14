import java.util.*;
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1};
selection(arr);
System.out.println(Arrays.toString(arr));
	}
	static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			// find the max ele in the remaining array and swap with correct index
			int last=arr.length-i-1;
			int max=getmax(arr,0,last);
			swap(arr,max,last);
			
		}
	}
	static void swap(int [] arr,int first,int sec) {
		int temp=arr[first];
		arr[first]=arr[sec];
		arr[sec]=temp;
	}
	static int getmax(int[] arr,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

}
