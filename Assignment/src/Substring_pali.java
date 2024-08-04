
public class Substring_pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paliString("","nitin");

	}
	static void paliString(String p,String up) {
		if(up.length()==0) {
			if(checkpali(p)) {
				System.out.println(p);
			}
			return;
		}
		paliString(p+up.substring(0),up.substring(1));
		paliString(p,up.substring(1));
	}
	static boolean checkpali(String p) {
		int left=0;
		int right=p.length()-1;
		
		while(left<right) {
			if(p.charAt(left)!=p.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
			
		}
		return true;
	}

}
