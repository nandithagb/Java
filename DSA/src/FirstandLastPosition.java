import java.util.*;

public class FirstandLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] searchRange(int[] nums, int target) {
		
		 int[] ans= {-1,-1};
		 int start=search(nums,target,true);
		 int end=search(nums,target,false);
		 ans[0]=start;
		 ans[1]=end;
		 return ans;
	    }
	 // this function just returns the index value of target
	public  int search (int [] nums,int target,boolean findstart) {
		int ans=-1;
		int start=0;
		    int end=nums.length-1;
		    
		    
		    while(start<=end){
		      
		        int mid =start+(end-start)/2;
		    
		        if(target<nums[mid]){
		            end=mid-1;
		        }
		        else if(target>nums[mid]){
		            start=mid+1;
		        }
		        else{
		            
		            ans=mid;
		            if(findstart) {
		            	end=mid-1;
		            }
		            else {
		            	start=mid+1;
		            }
		        }
		    }
		    return ans;
	 }

}
