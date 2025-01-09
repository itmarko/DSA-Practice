package dsa.Sorting;

/*
 * Radix Sort
 * Sort the given array using radix sort algorithm.
 * Eg: 
 * arr={170,79,608,721,9,99,199,10};
 * 
 * Idea : digit by digit sorting from less significant digit to 
 * most significant digit. behind the scene radix sort using counting sort.
 */
public class RadixSort {
	public static void main(String[] args) {
		int[] arr = { 170, 79, 608, 721, 9, 99, 199, 10 };
		radixSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void radixSort(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);

		}
		int exp = 1;
		while (max > 0) {
			max /= 10;
			countSort(arr, exp);
			exp *= 10;
		}
	}

	public static int[] countSort(int[] arr, int exp) {
		int n = arr.length;
		int[] p = new int[10];// range of the digit -> [0,9]

		// create the frequency of the array
		for (int i = 0; i < n; i++) {
			p[(arr[i] / exp) % 10]++;
		}
		// convert the array into prefixSum array
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] + p[i];
		}

		// traverse the original array and try to update ans[]
		int[] ans = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			int pos = p[(arr[i] / exp) % 10];
			ans[pos - 1] = arr[i];
			p[(arr[i] / exp) % 10]--;
		}

		// copy your ans in orignal array
		for (int i = 0; i < ans.length; i++) {
			arr[i] = ans[i];
		}
		return ans;
	}
}
