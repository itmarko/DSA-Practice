package dsa.HashMap;

import java.util.HashMap;

/*			Longest subarray with sum Divisible by K
 * ==================================================================================
 *  Given an integer arr of size N and interger K. Find the longest 
 *  subarray's length with the sum of elements divisible by K.
 *  Sample input
 *  arr = {2,7,6,1,4,5} K =3
 *  sample output
 *  
 */
public class LongestSubArrWithSumDivByK {
	public static void main(String[] args) {
		int[] arr = { 2,7,6,1,4,5};
		System.out.println(longestSubArrWithSumDivByK(arr, 3));
	}
	
	public static int longestSubArrWithSumDivByK(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int sum =0;
		int maxLen = 0;
		for(int i =0; i<arr.length; i++) {
			sum +=arr[i];
			int mod = ((sum%k)+k)%k;
			
			if(map.containsKey(mod)==true) {
			maxLen = Math.max(maxLen, i-map.get(mod));
			}else {
				map.put(mod, i);
			}
		}
		return maxLen;
				
	}
}
