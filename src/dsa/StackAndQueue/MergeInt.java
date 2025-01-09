package dsa.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/*
 * 										Merge Intervals
 * 									=======================
 * 	Given an array of interval in any order, merger all overlapping interval into 
 * 	one and return an array of non-overlapping intervals.
 * 
 * SAMPLE input 
 * intervals = {{1,4},{2,5},{7,14},{6,11}}
 * 
 * sample output 
 * non-overlapping intervas : {{1,5},{6,14}}
 */
public class MergeInt {
	public static void main(String[] args) {
		int[][] intervals = { { 1, 4 }, { 8, 12 }, { 3, 7 }, { 2, 6 }, { 9, 11 }, { 17, 25 }, { 15, 21 } };
		int[][] ans = mergeIntervals(intervals);
		for (int[] is : ans) {
			System.out.println(is[0] + " " + is[1]);
		}
	}

	public static int[][] mergeIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		Stack<int[]> st = new Stack<>();
		st.push(intervals[0]);

		for (int i = 1; i < intervals.length; i++) {
			if (st.peek()[1] >= intervals[i][0]) {
				st.peek()[1] = Math.max(st.peek()[1], intervals[i][1]);
			} else {
				st.push(intervals[i]);
			}
		}
		int[][] ans = new int[st.size()][2];
		for (int i = ans.length - 1; i >= 0; i--) {
			ans[i][0] = st.peek()[0];
			ans[i][1] = st.peek()[1];
			st.pop();
		}
		return ans;
	}
}
