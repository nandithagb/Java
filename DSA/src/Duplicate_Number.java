
public class Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static int findDuplicate(int[] arr) {
		 int i=0;
			while(i<arr.length) {
				int correct=arr[i];
				if(arr[i]!=arr[correct]) {
					swap(arr,i,correct);
				}else {
					i++;
				}
			}
			for(int in=0;in<arr.length;i++) {
				if(arr[in]!=in) {
					return arr[in];
				}
			}
			return arr[arr.length];
	    }
	
		static void swap(int [] arr,int first,int sec) {
			int temp=arr[first];
			arr[first]=arr[sec];
			arr[sec]=temp;
		}

}
