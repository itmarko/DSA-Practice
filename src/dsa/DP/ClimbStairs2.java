package dsa.DP;

/*
 *  Climb Stairs 2 memorization
 *  
 *  Given an integer Array A of length N. Where A is the cost of stepping on the ith stair.
 *     initially, you are at 1 stare find the minimum cost to react n stair.
 *     sample input 
 *     arr[] ={1,2,3,4}; sample output ans = 7;
 */
public class ClimbStairs2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(climbStairs2Tab(arr));
//		System.out.println(climbStairs2(arr, arr.length, new int[arr.length+1]));
	}
	
	/*
	 * public static int climbStairs2(int[] arr, int n, int []dp) { if (n == 1) {
	 * return arr[0];
	 * 
	 * } if (n == 2) { return arr[0] + arr[1]; } if(dp[n]!=0) { return dp[n]; } int
	 * f1 = climbStairs2(arr, n - 1,dp); int f2 = climbStairs2(arr, n - 2,dp); int
	 * ans = Math.min(f1, f2) + arr[n - 1]; dp[n]=ans; return ans; }
	 */
	public static int climbStairs2Tab(int [] arr) {
		int []dp = new int [arr.length];
		dp[0]=arr[0];
		dp[1] = arr[0]+arr[1];
		 for(int i=2; i<dp.length; i++) {
			 dp[i]=Math.min(dp[i-1], dp[i-2])+arr[i];
		 }
		 return dp[dp.length-1];
	}
}
