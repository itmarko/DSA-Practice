package dsa.DP;

import java.util.Scanner;

/*
 * Climb Stairs 1
 * 
 * You are given a number N which represent the number of stairs in stair-case.
 * Initially, you are at 0th stair and are required to climb to the top.
 * 
 * From ith stair, you can go to i+1th , i+2th or i+3rd number stair.
 * Find the total number of different parts by which you can reach to the top.
 * 
 *  Sample input N = 4
 *  Sample OutPut ans = 7
 *  
 *  
 *  Hint - try to think the recursive approach and look overlapping sub problems.
 *  if they are overlapping sub-problems, optimize it using memorization.
 *  
 */
public class ClimbStairsTab {
	public static void main(String args[]) {
		Scanner scnScanner = new Scanner(System.in);
		int n = scnScanner.nextInt();
		System.out.println(ClimbStairsTab(n));
		scnScanner.close();
	}

	public static int ClimbStairsTab(int n) {
		
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <=n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		return dp[n];
	}
}
