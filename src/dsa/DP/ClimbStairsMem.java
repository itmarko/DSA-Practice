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
public class ClimbStairsMem {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(ClimbStair(n, new int[n + 1]));
		scn.close();
	}

	public static int ClimbStair(int n, int dp[]) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		if (dp[n] != 0) {
			return dp[n];
		}
		int f1 = ClimbStair(n - 1, dp);
		int f2 = ClimbStair(n - 2, dp);
		int f3 = ClimbStair(n - 3, dp);
		int ans = f1 + f2 + f3;
		dp[n] = ans;
		return ans;
	}
}
