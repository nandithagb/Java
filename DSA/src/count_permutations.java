
public class count_permutations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=permutation("","abc");
		System.out.println(x);

	}
	static int permutation(String p,String up) {
		if(up.length()==0) {
		
		
		return 1;
		}
		int count=0;
		char ch= up.charAt(0);
		for (int i=0;i<=p.length();i++) {
			String f= p.substring(0,i);
			String l= p.substring(i,p.length());
			count+=permutation(f+ch+l,up.substring(1));
		}
		return count;
	}
}
