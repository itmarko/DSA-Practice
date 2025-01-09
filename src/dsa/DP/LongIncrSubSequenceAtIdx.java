package dsa.DP;

/*
 * Optimization  2 - Find Longest increasing subsequence ending at the particular index,
 * 
 */
public class LongIncrSubSequenceAtIdx {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 9, 5, 7, 3, 60, 80, 1 };
//		int[] arr = { 5,4,3,2,1};
//		System.out.println(lis2(arr, 0, -1, new int[arr.length][arr.length]));
		int ans  = 0;
		for(int i =0; i<arr.length; i++) {
			// finding length of list ending at ith index
			int len = lis2(arr, i);
			ans  = Math.max(ans, len);
		}
		System.err.println(ans);
	}

	public static int lis2(int[] arr, int i) {
		int max = 0;
		for(int j =0; j<i; j++) {
			if(arr[j]<arr[i]) {
				max = Math.max(max,lis2(arr, j));
			}
		}
		return max+1;
	}
}
