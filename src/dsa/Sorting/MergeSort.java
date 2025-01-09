package dsa.Sorting;

/*
 * 							Merge Sort
 * Sort the given array using merge sort algorithm.
 * 
 * Sample input :
 * arr = {5,7,-2,11,6,4,9,1};
 * Sample output :
 * ans : {-2,1,4,5,6,7,9,11}
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 8, 10, 12, 15 };
		int[] arr2 = { 3, 5, 7, 11 };
		int[] ans = mergeTwoSortedArray(arr, arr2);
		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] bans = new int[1];
			bans[0] = arr[lo];
			return bans;
		}
		int mid = (lo + hi) / 2;
		int[] fsh = mergeSort(arr, lo, mid);
		int[] ssh = mergeSort(arr, mid + 1, hi);
		int[] ans = mergeTwoSortedArray(fsh, ssh);
		return ans;
	}

	public static int[] mergeTwoSortedArray(int[] arr, int[] arr2) {
		int[] ans = new int[arr.length + arr2.length];
		int i = 0, j = 0;
		int k = 0;
		while (i < arr.length && j < arr2.length) {
			if (arr[i] <= arr2[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
