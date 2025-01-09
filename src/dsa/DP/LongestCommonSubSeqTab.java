package dsa.DP;

/*
 * Longest common subsequence 
 * Given two string A and B. Find the longest common subsequence (A sequence which doesn't need to be continuous), which is 
 * common in both the strings. You need to return the length of such longest common subsequence.
 * 
 * Sample input - 
 * A= "abbcdgf"															Complexity
 * B= "bbadcgf"															TC = O(n*m)
 * 																		SC = O(n2)
 * Sample output
 * output: 5
 */
public class LongestCommonSubSeqTab {
	public static void main(String[] args) {
		String a="abbcdgf";
		String b="bbadcgf";
//		System.out.println(LongestCommonSubSeqMem(a, b, 0, 0));
		System.out.println(LongestCommonSubSeqTab(a, b ));
	}

	public static int LongestCommonSubSeqTab(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = dp.length - 2; i >= 0; i--) {
			for (int j = dp[0].length - 2; j >= 0; j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i][j] = 1 + dp[i + 1][j + 1];
				}else {
					dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
				}
			}
		}
		return dp[0][0];

	}
}