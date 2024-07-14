//  https://leetcode.com/problems/find-in-mountain-array/
public class Search_in_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int search(int arr[],int target) {
		int peak=peakIndexInMountainArray(arr);
		int firsttry=orderagbs(arr,target,0,peak);
		if(firsttry!=-1) {
			return firsttry;
		}
		// try to search in second array
		return orderagbs(arr,target,peak+1,arr.length-1);
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
	 static int orderagbs(int [] arr,int target,int start,int end) {
			
			boolean isAsc = arr[start]<arr[end];

			while(start<=end){
			       // int mid=(start+end)/2;
			        int mid =start+(end-start)/2;
			        // this will give same as mid=(start+end)/2
			        
			        if(arr[mid]==target) {
			        	return mid;
			        }
			        if(isAsc) {
			        	  if(target<arr[mid]){
					            end=mid-1;
					        }
					        else {
					            start=mid+1;
					        }	
			        }
			        else {
			            if(target>arr[mid]){
				            end=mid-1;
				        }
				        else {
				            start=mid+1;
				        }
			        }
			  
			      
			    }
			    return -1;
			}
	

}
