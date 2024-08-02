
public class Maze_obstacle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze= {{true,true,true},{true,true,true},{true,true,true}};
		mazeall(maze,"",0,0);

	}
	static void mazepath(boolean maze[][],String p,int r,int c) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		if(r<maze.length-1) {
			mazepath(maze,p+"R",r+1,c);
		}
		if(c<maze.length-1) {
			mazepath(maze,p+"D",r,c+1);
		}
	}
	static void mazeall(boolean maze[][],String p,int r,int c) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		maze[r][c]=false;
		if(r<maze.length-1) {
			mazeall(maze,p+"D",r+1,c);
		}
		if(c<maze[0].length-1) {
			mazeall(maze,p+"R",r,c+1);
		}
		if(r>0) {
			mazeall(maze,p+"U",r-1,c);
		}
		if(c>0) {
			mazeall(maze,p+"l",r,c-1);
		}
		maze[r][c]=true;
	}

}
