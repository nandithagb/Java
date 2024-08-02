import java.util.ArrayList;

public class Maze_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mazepathretdiagonal("",3,3));

	}
	static void mazepath(String p,int r,int c) {
		if(r==1&&c==1) {
			System.out.println(p);
			return;
		}
		if(r>1) {
			mazepath(p+"R",r-1,c);
		}
		if(c>1) {
			mazepath(p+"D",r,c-1);
		}
	}
	static ArrayList<String> mazepathret(String p,int r,int c) {
		if(r==1&&c==1) {
			
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1) {
			list.addAll(mazepathret(p+"R",r-1,c));
		}
		if(c>1) {
			list.addAll(mazepathret(p+"D",r,c-1));
		}
		return list;
	}
	static ArrayList<String> mazepathretdiagonal(String p,int r,int c) {
		if(r==1&&c==1) {
			
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1 && c>1) {
			list.addAll(mazepathretdiagonal(p+"Dia",r-1,c-1));
		}
		if(r>1) {
			list.addAll(mazepathretdiagonal(p+"R",r-1,c));
		}
		if(c>1) {
			list.addAll(mazepathretdiagonal(p+"D",r,c-1));
		}
		return list;
	}

}
