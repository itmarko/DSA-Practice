package dsa.RecursionAndBacktracking;
/*
 * 			Solve sudoku
 * 	Given a partially solve sudoku. Write a program to solve it by filling all the empty spots.
 *  Note - Assume there is  only one possible solution.
 *  |------------------			-------------------				Rules to solve Sudoku
 *  |5|3| | |7| | | | |			|5|3|4|6|7|8|9|1|2|
 *  |6| | |1|9|5| | | |			|6|7|2|1|9|5|3|4|8|				1) Each of the digits 1-9 must appear exactly once in a row
 *  | |9|8| | | | |6| |			|1|9|8|3|4|2|5|6|7|
 *  |------------------			|8|5|9|7|6|1|4|2|3|				2) Each of the digits 1-9 must appear exactly once in a column
 *  |8| | | |6| | | |3|			|4|2|6|8|5|3|7|9|1|
 *  |4| | |8| |3| | |1|   ==>	|7|1|3|9|2|4|8|5|6|				3) Each of the digits 1-9 must appear exactly once in each of the
 *  |7| | | |2| | | |6|			|9|6|1|5|3|7|2|8|4|				   nine 3*3 grids
 *  |------------------			|2|8|7|4|1|9|6|3|5|
 *  | |6| | | | |2|8| |			|3|4|5|2|8|6|1|7|9|
 *  | | | |4|1|9| | |5|			-------------------
 *  |_|_|_|_|8|_|_|7|9|
 */
public class SolveSudoku {
	public static void main(String[] args) {

	       char [][] arr= {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
	               		   {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	               		   {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	               		   {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	               		   {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	               		   {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	               		   {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	               		   {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	               		   {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

	        		solveSudoku(arr);
	    }
		public static void solveSudoku(char [][]arr) {
			if(sudokuSolver(arr,0,0)) {
				for (char[] element : arr) {
					for(int j=0; j<arr[0].length;j++) {
						System.out.print(element[j]+" ");
					}
					System.out.println();
				}
			}
		}

		public static boolean sudokuSolver(char[][] arr,int x, int y) {
			if(x==arr.length) {
				return true;
			}
			int nx= y ==8 ? x+1:x;
			int ny= y ==8 ? 0:y+1;
			if(arr[x][y]=='.') {
				for(int val =1; val<=9; val++) {
					if(canWePlace(arr,x,y,val)) {
						arr[x][y] =(char) (val+'0');
						if(sudokuSolver(arr, nx, ny)) {
							return true;
						}
						arr[x][y]='.';
						}
				}
			}else {
				if(sudokuSolver(arr, nx, ny)) {
					return true;
				}
			}
			return false;
		}

		public static boolean canWePlace(char[][]arr,int x, int y, int val) {

			// check the row
			for(int col =0; col<arr[0].length;col++) {
				if(arr[x][col]==(char)(val+'0')) {
					return false;
				}
			}
			// check the column
			for (char[] element : arr) {
				if(element[y]==(char)(val+'0')) {
					return false;
				}
			}

			//check 9 3X3 grid
			x = x - (x%3);
			y = y - (y%3);
			for(int i= 0; i<2; i++) {
				for(int j=0; j<2;j++) {
					if(arr[x+i][y+j]==(char)(val+'0')) {
						return false;
					}
				}
			}
			return true;
		}
}
