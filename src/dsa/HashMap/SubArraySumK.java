package dsa.HashMap;

import java.util.HashMap;

/* 			Number of Sub arrays with sum K
 * ======================================================================
 * Given an sorted array of integer and an integer K. you 
 * need to find the number of subarray with sum K
 * 
 * Sample input
 * arr[] = {9,4,20,3,10,5}, k =33 
 * sample output 
 * 2
 */
public class SubArraySumK {
	public static void main(String[] args) {
		int[] arr = { 9, 4, 20, 3, 10, 5 };
		System.out.println(subArraySumK(arr, 33));
	}

	public static int subArraySumK(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int ans = 0;
		int psum = 0;
		for (int i = 0; i < arr.length; i++) {
			psum += arr[i];
			if (map.containsKey(psum - k) == true) {
				ans += map.get(psum - k);
			}
			map.put(psum, map.getOrDefault(psum, 0) + 1);
		}
		return ans;
	}

}
