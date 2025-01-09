package dsa.DP;
/*
 * Longest common subsequence 
 * Given two string A and B. Find the longest common subsequence (A sequence which doesn't need to be continuous), which is 
 * common in both the strings. You need to return the length of such longest common subsequence.
 * 
 * Sample input - 
 * A= "abbcdgf"
 * B= "bbadcgf"
 * 
 * Sample output
 * output: 5
 */
public class LongestCommonSubSeq {
	public static void main(String[] args) {
		String a="abbcdgf";
		String b="bbadcgf";
//		System.out.println(LongestCommonSubSeqMem(a, b, 0, 0));
		System.out.println(LongestCommonSubSeqMem(a, b,0,0, new int[a.length()][b.length()]));
	}
	
	public static int LongestCommonSubSeqMem(String s1, String s2, int i, int j, int[][] dp) {
		if(i==s1.length() || j==s1.length()) {
			return 0;
		}
		
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int ans =0;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans =1+LongestCommonSubSeqMem(s1, s2, i+1, j+1, dp);
		}else {
			ans = Math.max(LongestCommonSubSeqMem(s1, s2, i, j+1,dp),LongestCommonSubSeqMem(s1, s2, i+1, j,dp));
		}
		dp[i][j]=ans;
		return ans;
	}
}
