package javaaa;
import java.util.*;
public class Product_of_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    int prod=1;
		ArrayList <Integer> arr=new ArrayList<Integer>();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				arr.add(i);
			}
		}
		
		for(int i=0;i<arr.size();i++){
		    int fact=arr.get(i);
		    int count=0;
		    for(int j=1;j<=fact;j++){
		       
		        if(fact%j==0){
		            count++;
		        }
		    }
		    if(count<=2){
		        System.out.print(arr.get(i)+" ");
		        prod*=arr.get(i);
		    }
		}
		System.out.println();
		System.out.println(prod);
	}

}
