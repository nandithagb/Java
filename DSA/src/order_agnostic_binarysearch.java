import java.util.Scanner;

public class order_agnostic_binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// find whther the array is sorting in ascending order or descending order
		int [] arr={9,8,7,6,5,4,3,2,1};
		int target=5;
		int ans=orderagbs(arr,target);
		System.out.println(ans);
			
	}
	static int orderagbs(int [] arr,int target) {
		
		
		int start=0;
		int end=arr.length-1;
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


