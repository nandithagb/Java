
package javaaa;
import java.util.Scanner;
import java.util.ArrayList;
public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {1,2,3,6,3,6,1};
			ArrayList<Integer> arrayList = new ArrayList<>();
			int count=0;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]&&!arrayList.contains(a[i])) {
						arrayList.add(a[i]);
						
					}
				}
			}
			System.out.println(arrayList);
	}

}
