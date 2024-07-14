import java.util.Scanner;

public class finding_in_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int k=0;
int arr[][]=new int[n1][n1];
for(int i=0;i<n1;i++) {
	for(int j=0;j<n1;j++) {
		arr[i][j]=k;
		k++;
	}
}
for(int i=0;i<n1;i++) {
	for(int j=0;j<n1;j++) {
		if(arr[i][j]==n2) {
			System.out.println(i+ " "+j);
		}
	}
}
	}

}
