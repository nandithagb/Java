public class Floor
{
	public static void main(String[] args) {
		
		int [] arr={2,3,5,9,14,16,18};
		int target=1;
		int ans=binarysearch(arr,target);
		System.out.println(ans);
	}
	// return the index greatest nu<=target
	
	static int binarysearch(int [] arr,int target){
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end){
	       // int mid=(start+end)/2;
	        int mid =start+(end-start)/2;
	        // this will give same as mid=(start+end)/2
	        if(target<arr[mid]){
	            end=mid-1;
	        }
	        else if(target>arr[mid]){
	            start=mid+1;
	        }
	        else{
	            // ans found
	            return mid;
	        }
	    }
	    return end;
	}
}