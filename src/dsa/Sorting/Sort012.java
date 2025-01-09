package dsa.Sorting;

/*
 * Sort 0,1,2
 * Given an array contains 0's, 1's and 2's . Sort the array. 
 * Note - You can't use any library function. 
 * 		- Traverse array only once
 * 
 * Sample input 
 * arr = {0,1,1,0,2,1,0,0,2,0,2,1}
 * 
 * Sample output
 * arr = {0,0,0,0,1,1,1,1,2,2,2}
 * 
 * SOL
 *  Approach 1 
 */
public class Sort012 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 2, 1, 0, 0, 2, 0, 2, 1 };
		sort01(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void sort01(int[] arr) {
		int i = 0, j = 0, k = arr.length - 1;
		while (i <= k) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else if (arr[i] == 1) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k--;
			}
		}
	}
}
