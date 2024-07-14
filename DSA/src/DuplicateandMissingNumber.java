
public class DuplicateandMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public int[] findErrorNums(int[] arr) {
       
	int i=0;
	while(i<arr.length) {
		int correct=arr[i]-1;
		if(arr[i]!=arr[correct]) {
			swap(arr,i,correct);
		}else {
			i++;
		}
	}
	for(int in=0;in<arr.length;in++) {
		if(arr[in]!=in+1) {
			return new int[] {arr[in],in+1};
		}
		
	}
	return new int[] {-1,-1};
	
    }
static void swap(int [] arr,int first,int sec) {
	int temp=arr[first];
	arr[first]=arr[sec];
	arr[sec]=temp;
}

}
