package dsa.Final450;

/*
 * Move all the negative elements to one side of the array 
 * Time complexity: O(N)
 * Auxiliary Space: O(1)
 */
import java.util.Scanner;

public class Practice05 {
	static void arrangeArray(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			if (arr[left] < 0 && arr[right] > 0) {
				left++;
				right--;
			} else if (arr[left] < 0 && arr[right] < 0) {
				left++;
			} else if (arr[left] > 0 && arr[right] > 0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter the array !");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array element !");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();
		arrangeArray(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
