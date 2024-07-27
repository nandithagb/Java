
public class alternate_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
			else {
				sum-=arr[i];
			}
		}
System.out.println(sum);
	}

}
