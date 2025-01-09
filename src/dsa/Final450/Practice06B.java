package dsa.Final450;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice06B {
	static ArrayList<Integer> findIntersecton(int[] a, int[] b) {
		ArrayList<Integer> resArrayList = new ArrayList<>();
		int m = a.length;
		int n = b.length;
		for (int i = 0; i < m; i++) {
			if (i > 0 && a[i - 1] == a[i])
				continue;

			for (int j = 0; j < n; j++) {
				if (a[i] == b[j]) {
					resArrayList.add(a[i]);
					break;
				}
			}

		}
		return resArrayList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array !");
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Enter the First Array element !");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Enter the Secound Array element !");
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		scanner.close();
		ArrayList<Integer> resArrayList = findIntersecton(a, b);
		for (int val : resArrayList) {
			System.out.print(val + " ");
		}
	}
}
