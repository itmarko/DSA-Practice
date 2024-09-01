package dsa.RecursionAndBacktracking;
/*
 * The N-Queen puzzle is the problem of placing N Queen on an N*N
 * chessboard such that no two queen attach each other
 *
 *  Given an integer N, Return all distinct solution to the N-Queen puzzle
 *
 *  for N = 4
 *  ["Q...",
 *   "...Q",	// Solution 1
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",
 *   "Q...",	// Solution 2
 *   "...Q"
 *   ".Q.."]
 */

public class NQueen {


	public static void main(String[] args) {
		int n=4;
		char [][]arr = new char[n][n];
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]='.';
			}
		}
		nQueen(arr,0);
	}
	public static void print(char[][]arr) {
		for (char[] element : arr) {
			for(int j=0;j<arr[0].length; j++) {
				System.out.print(element[j]+" ");
			}

			System.out.println();
		}
	}

	public static boolean isSafe(char[][]arr, int row, int col) {
			//		checking col
		for(int i=0; i<row; i++) {
			if(arr[i][col] =='Q') {
				return false;
			}
		}
		// Checking diagonal 1
		for(int i =row-1, j=col+1;i>=0 && j<arr[0].length; i--,j++) {
			if(arr[i][j]=='Q'){
				return false;
			}
		}
		//		checking diagonal 2
		for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		return true;

	}
	public static void nQueen(char [][]arr, int row) {
		if(row==arr.length) {
			//decide for every row
			print(arr);
			System.out.println("-------");
			return;
		}

		for(int col =0; col<arr[0].length; col++) {
			if(isSafe(arr, row, col)) {
				arr[row][col]='Q';
				nQueen(arr, row+1);
				arr[row][col]='.';
			}
		}
	}
}
