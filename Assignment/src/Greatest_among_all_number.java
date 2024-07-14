import java.util.*;
public class Greatest_among_all_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		ArrayList <Integer> arr= new ArrayList<>();
		while(true) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			else{
				arr.add(n);
			}
		}
		Integer[] array=arr.toArray(new Integer[0]);
		Arrays.sort(array);
		System.out.println("the greatest number is"+array[array.length-1]);

	}

}
