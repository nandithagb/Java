import java.util.*;
public class return_without_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,3,4,5};
		int target=3;
		System.out.println(find(arr,target,0));
	}
	static ArrayList<Integer> find(int []arr ,int target,int n){
		ArrayList<Integer> list= new ArrayList<>();
		if(n==arr.length) {
			return list;
		}
		if(arr[n]==target) {
			list.add(n);
		}
		ArrayList<Integer> ansbelow= find(arr,target,n+1);
		list.addAll(ansbelow);
		return list;
	}


}
