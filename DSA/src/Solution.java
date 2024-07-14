import java.util.Arrays;

public class Solution {
	//https://leetcode.com/problems/missing-number/
	// amazon question
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		missingNumber(arr);
		System.out.println(Arrays.toString(arr));
	}
    static int missingNumber(int[] arr) {
    	int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]<arr.length&&arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		for(int in=0;in<arr.length;in++) {
			if(arr[in]!=in) {
				return in;
			}
			
		}
		return arr.length;
 

    }
  
	static void swap(int [] arr,int first,int sec) {
		int temp=arr[first];
		arr[first]=arr[sec];
		arr[sec]=temp;
	}
}
