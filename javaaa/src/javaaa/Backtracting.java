package javaaa;

public class Backtracting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int x= ar.length-1;
		int y = ar[0].length-1;
		int path= recu(0,0,ar);
		System.out.println(path);
	}
	static int recu(int p,int q, int[][] ar) {
		if((p<0 || p>ar.length-1)|| (q<0 || q>ar.length-1)){
			return 0;
		}
		if((p==ar.length-1) &&  (q==ar.length-1) ) {
			return 1;
		}
		int x=recu(p+1,q,ar);
		int y=recu(p,q+1,ar);
		return x+y;
		
		
		
	}

}
