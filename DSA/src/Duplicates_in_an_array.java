import java.util.ArrayList;

public class Duplicates_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> findDuplicates(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		ArrayList <Integer> ans= new ArrayList<>();
		for(int in=0;i<arr.length;i++) {
			if(arr[in]!=in+1) {
				ans.add(arr[in]);
			}
		}
		return ans;
    }
	
	static void swap(int [] arr,int first,int sec) {
		int temp=arr[first];
		arr[first]=arr[sec];
		arr[sec]=temp;
	}

}
