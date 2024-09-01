package dsa.Array;

import java.util.HashMap;

/*
 *  2 SUM
 *
 *   Given an array of size N an an integer 'target' . Find the indices(i,j) of two number such that their sum is equal to
 *   target (i!=j)
 *    you can assume that their will be exactly one solutions
 *
 *    simple input
 *     N = 5
 *     array = {7,6,3,8,2}
 *
 *     target = 14;
 *     simple output
 *     1 3
 *
 */

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {7,6,3,8,2};
		int target = 14;
		int[] ans = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.length; i++) {
			int sno = target-arr[i];
			if(map.containsKey(sno)) {
				ans[0]=map.get(sno); // index of the other number
				ans[1] = i; // current index
			}
			map.put(arr[i], i);
		}
		System.out.println(ans[0]+" "+ans[1]);
	}
}
