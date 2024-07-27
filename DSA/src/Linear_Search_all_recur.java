import java.util.*;
public class Linear_Search_all_recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,3,4,5};
		int target=3;
		search(arr,target,0);
System.out.println(list);
	}
	static ArrayList<Integer> list= new ArrayList<>();
static void search(int []arr,int target,int n) {
	if(n==arr.length) {
		return;
	}
	if(arr[n]==target) {
		list.add(n);
	}
	search(arr,target,n+1);
}
}
