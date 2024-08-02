import java.util.Arrays;

public class Path_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze= {{true,true,true},{true,true,true},{true,true,true}};
		int[][] path= new int [maze.length][maze[0].length];
		mazeall(maze,"",0,0,path,1);

	}
	static void mazeall(boolean maze[][],String p,int r,int c,int[][]path,int step) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			path[r][c]=step;
			for(int []arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		maze[r][c]=false;
		path[r][c]=step;
		if(r<maze.length-1) {
			mazeall(maze,p+"D",r+1,c,path,step+1);
		}
		if(c<maze[0].length-1) {
			mazeall(maze,p+"R",r,c+1,path,step+1);
		}
		if(r>0) {
			mazeall(maze,p+"U",r-1,c,path,step+1);
		}
		if(c>0) {
			mazeall(maze,p+"l",r,c-1,path,step+1);
		}
		maze[r][c]=true;
		path[r][c]=0;
	}
}
