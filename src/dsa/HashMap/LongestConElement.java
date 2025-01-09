package dsa.HashMap;

import java.util.HashMap;

/**
 * @author marko
 */
public class LongestConElement {
	public static void main(String[] args) {
		int[] arr = { 11, 7, 1, 17, 6, 2, 3, 16, 8, 4, 9, 10, 15 };
		System.out.println(longestConsuSeq(arr));
	}

	public static int longestConsuSeq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		// 1. assume every element as the starting point of longest common sequence
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}
		// 2. Consider only valid starting point
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1) == true){
				map.put(arr[i], false);
  
			}
		}
		// 3. for every valid starting point find the length of longest common sequence
		int maxlen = 1;
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == true) {
				int currlen = 1;
				int val = arr[i];
				while (map.containsKey(val + 1)) {
					currlen++;
					val++;

				}
				maxlen= Math.max(maxlen, currlen);
			}
		}
		return maxlen;
	}
}
