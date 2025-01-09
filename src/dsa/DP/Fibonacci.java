package dsa.DP;

/*
 * Dynamic programming
 * 
 * it is an optimization over recursion
 * 
 * Fibonacci number
 * 
 * Find Nth fibonacci number.
 *  Fibonacci number from a sequence in which every number is the sum of two preceding numbers.
 *  First few fibonacci number are 0,1,1,2,3,5,8,13,21,34,55,.......
 *  Sample input N= 10
 *  Sample output 55
 */
public class Fibonacci {
	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibTab(n)); // without memorization

//		System.out.println(fib(n, new int[n+1]));	// using memorization 
	}

	public static int fibTab(int n) { // Iterative - tabulation (bottom-up approach)
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	/*
	 * public static int fib(int n, int[] dp) { if (n == 0 || n == 1) { return n; }
	 * 
	 * if (dp[n] != 0) { return dp[n]; } int fn = fib(n - 1, dp) + fib(n - 2, dp);
	 * dp[n] = fn; return fn; }
	 */
}
