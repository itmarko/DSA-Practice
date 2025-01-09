package dsa.Final450;

import java.util.Arrays;
import java.util.Scanner;

public class Pracitce07 {
	static void rotate(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
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
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}
}
