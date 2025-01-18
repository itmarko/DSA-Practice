package dsa.Final450;

import java.util.Scanner;

/*
 * find duplicate in an array of N+1 Integers

 */
public class Practice11 {
	static int findDuplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}

			}
		}
		return -1;
	}

	static void printArr(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter !");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the " + n + " number of element !");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int duplicate = findDuplicate(arr);

		// Output the result
		if (duplicate != -1) {
			System.out.println("Duplicate found: " + duplicate);
		} else {
			System.out.println("No duplicate found");
		}
		scanner.close();
	}
}
