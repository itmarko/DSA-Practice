package dsa.Final450;

import java.util.Scanner;
/*
 * find Largest sum contiguous Subarray [V. IMP]

 * check this input  output is 11
 * 2 3 -8 7 -1 2 3
 */
public class Practice08 {
	static int maxSum(int[] arr) {
		int res = arr[0];
		int currSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currSum = Math.max(currSum + arr[i], arr[i]);
			res = Math.max(res, currSum);

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array !");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the Array element !");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(maxSum(arr));
	}
}
