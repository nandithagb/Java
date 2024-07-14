import java.util.*;
public class SearchinSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][ ]arr={
			{1,2,3},
			{4,5,6},
			{7,8,9}

	};
		System.out.println(Arrays.toString(search(arr,6)));
	}
	static int[] binarysearch(int[][]matrix,int row,int colstart,int colend,int target) {
		while(colstart<=colend) {
			int mid=colstart+(colend-colstart)/2;
			if(matrix [row] [mid]==target) {
				return new int [] {row,mid};
			}
			if(matrix [row] [mid]<target) {
				colstart=mid+1;
			}
			else {
				colend=mid-1;
			}
			
		}
		return new int[] {-1,-1};
	}
	static int[] search(int[][]matrix,int target) {
		int rows=matrix.length;
		int col=matrix[0].length;
		if(rows==1) {
			return binarysearch(matrix,0,0,col-1,target);
		}
		// run the loop till two rows are remaining
		int rstart=0;
		int rend=rows-1;
		int cmid=col/2;
		while(rstart<(rend-1)/2) {
			int mid=rstart+(rend-rstart)/2;
			if(matrix[mid][cmid]==target) {
				return new int[] {mid,cmid};
			}
			if(matrix[mid][cmid]<target) {
				rstart =mid;
			}
			else {
				rend=mid;
			}
		}
		// noe we have two rows
		
		if(matrix[rstart][cmid]==target) {
			return new int[]{rstart,cmid};
		}
		if(matrix[rstart+1][cmid]==target) {
			return new int[]{rstart+1,cmid};
		}
		// search in first half 
		if(target<=matrix[rstart][cmid-1]) {
			return binarysearch(matrix,rstart,0,cmid-1,target);
		}
if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][col-1]) {
	return binarysearch(matrix,rstart,cmid+1,col-1,target);	
		}
if(target<=matrix[rstart+1][cmid-1]) {
	return binarysearch(matrix,rstart+1,0,cmid-1,target);	
}
else {
	return binarysearch(matrix,rstart+1,cmid+1,col-1,target);	
}
	}
	

}
