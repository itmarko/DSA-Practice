package dsa.HashMap;

import java.util.HashMap;

/*					Longest sumarray with sum k 
 * ====================================================================
 * Given an unsorted array of integer and an integer k. You 
 * need to fined the subarray with sum sum = k 
 * Sample input 
 * arr = {10,5,2,7,1,9} k = 15
 * Sample output
 * 4
 * 
 */
public class LongestSubArrayWithSumK {
	public static void main(String[] args) {
		int[] arr = { 10,5,2,7,1,9};
		System.out.println(longestSubArrayWithSumK(arr, 15));
	}
	
	public static int longestSubArrayWithSumK(int[] arr, int k) {
		int maxLen = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		// First occurence of the sum
		map.put(0, -1);//cover the edge case
		int psum =0;
		for(int i=0; i<arr.length;i++) {
			psum += arr[i];
			if(map.containsKey(psum-k)==true) {
				maxLen = Math.max(maxLen, i-map.get(psum-k));
			}
			if(map.containsKey(psum-k)==false) {
				// if the psum is appear in the first time 
				map.put(psum, i);
				
			}
		}
		return maxLen;
	}
}
