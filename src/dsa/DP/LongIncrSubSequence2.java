package dsa.DP;
/*
 * Longest increasing Subsequence memorization
 *  Given an array . find the length of longest strictly increasing subsequence.
 *  
 *  Sample input :
 *  arr = {10,2,9,5,7,3,60,80,1};
 *  sample output 							TC = O(n2)
 *  										SC = O(n)
 *  output -5
 */
public class LongIncrSubSequence2 {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 9, 5, 7, 3, 60, 80, 1 };
//		int[] arr = { 5,4,3,2,1};
//		System.out.println(lis2(arr, 0, -1, new int[arr.length][arr.length]));
//		int ans = 0;
//		for (int i = 0; i < arr.length; i++) {
//			// finding length of list ending at ith index
//			int len = lisTab(arr);
//			ans = Math.max(ans, len);
//		}
		System.out.println(lisTab(arr));
	}

	public static int lisTab(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = 1;
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {

					max = Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
}
