package dsa.DP;

/*
 * Longest increasing Subsequence memorization
 *  Given an array . find the length of longest strictly increasing subsequence.
 *  
 *  Sample input :
 *  arr = {10,2,9,5,7,3,60,80,1};
 *  sample output 							TC = O(n)2
 *  										SC = O(n)2
 *  output -5
 */
public class LongIncrSubSequence {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 9, 5, 7, 3, 60, 80, 1 };
		System.out.println(lis(arr, 0, -1, new int[arr.length][arr.length]));
	}

	public static int lis(int[] arr, int idx, int psidx, int[][] dp) {
		if (idx == arr.length) {
			return 0;
		}
		 
		if(psidx !=-1 && dp[idx][psidx]!=0) {
			return dp[idx][psidx];
		}
		int f1 = 0 + lis(arr, idx + 1, psidx, dp);
		int f2 = 0; // current element wants to be part of subsequence
		if (psidx == -1 || arr[idx] > arr[psidx]) {
			f2 = 1 + lis(arr, idx + 1, idx, dp);
		}
		int ans = Math.max(f1, f2);
		if(psidx !=-1) {
			dp[idx][psidx] = ans;
		}
		return ans;
	}
}
