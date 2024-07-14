import java.util.ArrayList;
public class Missing_Numbers_all {
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	// GOOGLE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
			int i=0;
			while(i<nums.length) {
				int correct=nums[i]-1;
				if(nums[i]!=nums[correct]) {
					swap(nums,i,correct);
				}else {
					i++;
				}
			}  
			
			// just find missing number
			ArrayList <Integer> ans= new ArrayList<>();
			for(int in=0;i<nums.length;i++) {
				if(nums[in]!=in+1) {
					ans.add(in+1);
				}
			}
			return ans;
	   }
		
	static	 void swap(int [] arr,int first,int sec) {
			int temp=arr[first];
			arr[first]=arr[sec];
			arr[sec]=temp;
		}

}
