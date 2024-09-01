package dsa.BinarySearch;

import java.util.Scanner;

/*
 * Find element is sorted 2D array
 *
 *  Given a row-wise and columan-wise sorted matrix and a target
 *  check if target is present in the matrix
 *
 * Simple input
 * matrix ={1,4,6,8,10
 * 			2,7,9,12,15
 * 			3,11,20,22,24
 * 			5,16,25,30,40}
 * target =11
 *
 * Simple output
 * true
 *
 */
public class SearchInSortedMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = { { 1, 4, 6, 8, 10 },
				{ 2, 7, 9, 12, 15 },
				{ 3, 11, 20, 22, 24 },
				{ 5, 16, 25, 30, 40 } };
		System.out.println("Enter the target value :");
		int target = scn.nextInt();
		System.out.println(SearchInMatrix(arr, target));
		scn.close();

	}

	public static boolean SearchInMatrix(int[][] arr, int target) {
		int i = 0, j = arr[0].length - 1;

		while (i < arr.length && j >= 0) {
			if (arr[i][j] == target) {
				return true;
			} else if (arr[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}
}
