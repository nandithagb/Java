package javaaa;
import java.util.*;
public class Duplicatesinset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,6,3,6,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		
	}

}
