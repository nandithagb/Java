import java.util.*;
public class non_prime_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {25,34,1,2,34,56};
ArrayList<Integer> list= new ArrayList<>();
for(int i=0;i<arr.length;i++)
{
	if(!isprime(arr[i])) {
		list.add(i);
	}
}
System.out.println(list);

int sum=0;
for(int n:list) {
	sum+=n;
}
System.out.println(sum);

	}
	static boolean isprime(int n) {
		if(n<2) {
			return false;
		}
	
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		
		return true;
	}

}
