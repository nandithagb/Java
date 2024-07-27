
public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern31(5);
	}
	static void pattern (int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int i=0;i<2*n;i++) {
			int totalcol=  i>n?2*n-i:i;
			for(int j=0;j<totalcol;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int i=0;i<2*n;i++) {
			int totalcol= i>n?2*n-i:i;
			int space=n-totalcol;
			for(int s=0;s<space;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<totalcol;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			int spacce=n-row;
			for(int s=0;s<spacce;s++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	static void pattern31(int n) {
		int Original=n;
		n=2*n;
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				int atevery=Original-Math.min(Math.min(row, col), Math.min(n-row, n-col));
				System.out.print(atevery+" ");
			}
			System.out.println();
		}
	}
	static void pattern30(int n) {
		
		n=2*n;
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				int atevery=Math.min(Math.min(row, col), Math.min(n-row, n-col));
				System.out.print(atevery+" ");
			}
			System.out.println();
		}
	}

}
