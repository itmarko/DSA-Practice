package dsa.RecursionAndBacktracking;

import java.util.ArrayList;

/*
 *	Print All Permutations
 *	Given an array Size of N which contains distinct integer. You have to print all the possible permutation
 *	Simple input Array ={1,2,3}
 *	Simple Output
 *	1 2 3
 *	1 3 2
 *	2 1 3
 *	2 3 1
 *	3 1 2
 *	3 2 1
 */
public class PrintPermutations {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		printPermutations(arr, 0, new boolean[arr.length], new ArrayList<>());
	}

	public static void printPermutations(int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans) {

		if (pos == arr.length) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!selected[i]) {
				selected[i] = true;
				ans.add(arr[i]);
				printPermutations(arr, pos + 1, selected, ans);
				selected[i] = false;
				ans.remove(ans.size() - 1);
			}
		}
	}
}
