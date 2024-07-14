package javaaa;
import java.util.*;
public class smallest_prime_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[10];
		ArrayList <Integer> arr=new ArrayList<>();
		int b[]= {10,11,12,13,14,15};
		int sum=0;
		for(int i=0;i<b.length;i++) {
			if(isprime(b[i])) {
				arr.add(b[i]);
				sum+=b[i];
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.size();i++) {
			
			if(min>arr.get(i)) {
				min=arr.get(i);
			}
			
		}
		System.out.println(min);
		System.out.println(sum-min);

	}
	static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
