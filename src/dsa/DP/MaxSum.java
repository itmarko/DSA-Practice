package dsa.DP;
/*
 * Maximum Sub array Sum 
 * Given an array of integer . Find the maximum sub array sum
 * Sample input 
 * arr = {2,-3,5,-2,6,-8,2,1,9,-6,4};
 * Sample output
 * output : 13
 */
public class MaxSum {
	public static void main(String[] args) {
		int[]arr = {2,-3,5,-2,6,-8,2,1,9,-6,4};
		System.out.println(MaxSumSubArray(arr));
	}

	public static int MaxSumSubArray(int []arr) {
		int currsum = 0;
		int maxsum =Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			currsum = Math.max(arr[i], currsum+arr[i]);    // TC = O(n)
			maxsum=Math.max(currsum, maxsum);			   // SC = O(1)
		}
		return maxsum;
	}
}

