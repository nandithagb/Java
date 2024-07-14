package javaaa;
import java.util.*;
public class Linearrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] parts = s.split(" ");
		int arr[]=new int[parts.length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(parts[i]);
	}
	int n=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) {
			System.out.println(i);
		}
	}

	}

}
