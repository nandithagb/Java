import java.util.Arrays;

public class Cyclic_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void cyclic(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
	}
	static void swap(int [] arr,int first,int sec) {
		int temp=arr[first];
		arr[first]=arr[sec];
		arr[sec]=temp;
	}
	

}
