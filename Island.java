package Graphs;

public class Island {
	
	public static int islandCount(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int count = 0;
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(matrix[i][j] ==  1) {
					count++;
					findCount(matrix,i,j);
				}
			}
		}
		return count;
	}
	
	public static void findCount(int[][] matrix, int i, int j) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0) {
			return;
		}
		matrix[i][j] = 0;
		
		findCount(matrix,i+1,j);
		findCount(matrix,i-1,j);
		findCount(matrix,i,j+1);
		findCount(matrix,i,j-1);
	}
	

	public static void main(String[] args) {
		
		int[][] check = {
	            { 1, 1, 0, 0, 0 },
	            { 0, 1, 0, 0, 1 },
	            { 1, 0, 0, 1, 1 },
	            { 0, 0, 0, 0, 0 },
	            { 0, 0, 1, 1, 0 }
	        };
		

		int[][] check2 = {
	            { 1, 1, 0, 0, 1 },
	            { 0, 1, 1, 0, 1 },
	            { 1, 0, 0, 1, 1 },
	            { 0, 1, 0, 0, 0 },
	            { 1, 0, 1, 1, 0 }
	        };
		

		int[][] check3 = {
	            { 1, 0, 1, 0, 1 },
	            { 0, 0, 0, 0, 0 },
	            { 1, 0, 1, 0, 1 },
	            { 0, 0, 0, 0, 0 },
	            { 1, 0, 1, 0, 1 }
	        };
		System.out.println(islandCount(check));
		System.out.println(islandCount(check2));
		System.out.println(islandCount(check3));

	}

}
