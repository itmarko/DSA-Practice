package dsa.Sorting;

/*
 * 											Merge Two Sorted array 
 * 				Given two sorted arrays. Merge them to make a new sorted array.
 * 		
 * 		Sample input:
 * 		arr1={2,3,8,10,12,15}
 * 		arr2={3,5,7,11}
 * 		Sample Output: 
 * 		ans = {2,3,3,5,7,8,10,11,12,15}
 */
public class mergeTwoSortedArr {
	public static void main(String[] args) {
		int[] arr = {2,3,8,10,12,15};
		int[] arr2 = { 3, 5, 7, 11 };
		int[] ans = mergeTwoSortedArray(arr, arr2);
		for (int val : ans) {
			System.out.print(val + " ");
		}
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
