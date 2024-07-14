// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountian_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int peakIndexInMountainArray(int[] arr) {
	        int start=0;
	        int end=arr.length-1;
	        while(start<end) {
	        	  int mid =start+(end-start)/2;
	      	    if(arr[mid]>arr[mid+1]) {
	      	    	// you are in the dec part of array
	      	    	// this may be the answer ,but look left
	      	    	// this is why end!=mid-1
	      	    	end=mid;
	      	    }
	      	    else {
	      	    	// you are inn asc part of array
	      	    	start=mid+1;
	      	    	// because we lknow that mid+1 element?mid element
	      	    }
	        }
	        // in the end ,start==end and pointing to the largest number
		 return start;
	    }

}
