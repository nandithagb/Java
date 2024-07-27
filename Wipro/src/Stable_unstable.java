import java.util.*;
public class Stable_unstable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {12, 1313, 122, 678, 898};
int sum=0;
for(int i=0;i<arr.length;i++) {
	if(!stable(arr[i])) {
		sum+=arr[i];
	}
}
System.out.println(sum);
		
	}
	static boolean stable(int n) {
		int []ar= new int[10];
		while(n>0) {
			int rem=n%10;
			ar[rem]++;
			n/=10;
		}
		boolean isstable=true;
		int first=0;
		for(int i=0;i<10;i++) {
			if(ar[i]>0) {
				first=ar[i];
				break;
			}
		}
		 for (int i = 0; i < 10; i++) {
		        if (ar[i] > 0 && ar[i] != first) {
		            isstable = false;
		            break;
		        }
		    }
		return isstable;
	}

}
