package dsa.Sorting;

/*
 * 											Sort Dates
 * 										=================
 * Sort the given array of string representing dates in DDMMYYYY Format
 * Eg. arr{"05121968", "17121996", "11081972","11081990", "05061997"}
 */
public class SortDates {
	public static void main(String[] args) {
		String[] arr = { "05121968", "17121996","05061997", "11081972", "11081990" };
		sortDate(arr);
		for (String string : arr) {
			System.out.print(string + " ");
		}
	}

	public static void sortDate(String[] arr) {
		countSort(arr, 31, 1000000, 100);	// on the bases of DD   		TC = O(N+R)
		countSort(arr, 12, 10000, 100);	// on the bases of MM				SC= O(N+R)
		countSort(arr, 2500, 1, 10000);	// on the bases of YYYY
	}

	public static void countSort(String[] arr, int range, int div, int mod) {
		int n = arr.length;
		int[] p = new int[range + 1];

		// create the frequency of the array
		for (int i = 0; i < n; i++) {
			p[(Integer.parseInt(arr[i]) / div) % mod]++;
		}
		// convert the array into prefixSum array
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] + p[i];
		}

		// traverse the original array and try ot update ans[]
		String[] ans = new String[n];
		for (int i = n - 1; i >= 0; i--) {
			int pos = p[(Integer.parseInt(arr[i]) / div) % mod];
			ans[pos - 1] = arr[i];
			p[(Integer.parseInt(arr[i]) / div) % mod]--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}
}
