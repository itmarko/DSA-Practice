package dsa.Sorting;

/*
 * Counting Sort Algorithm
 * Sort the given array using counting sort algorithm.
 * Eg: {6,8,1,3,1,4,9,1,2,8,8,7}
 * 
 * Idea: Find the count of every distinct element in the array and
 * then using this count to find the position of element in the sorted array.
 * 
 * Counting sort assuming that data is given range like [0,10]	
 * arr={6,8,1,3,1,4,9,1,2,8,8,7}
 * step 1- Store the frequency of every element in the array 
 * step 2- Convert this array into prefixSum.
 * step 3- Traverse the given array again and find the position of every element int the ans[] array.
 * 
 */
public class CountingSort {
	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 3, 1, 4, 9, 1, 2, 8, 8, 7 };
		int ans[] = countSort(arr);
		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

	public static int[] countSort(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] p = new int[max + 1];
		// create the frequency of the array
		for (int i = 0; i < n; i++) {
			p[arr[i]]++;
		}
		// convert the array into prefixSum array
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] + p[i];
		}

		// traverse the original array and try ot update ans[]
		int[] ans = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			int pos = p[arr[i]];
			ans[pos - 1] = arr[i];
			p[arr[i]]--;
		}
		return ans;
	}
}
