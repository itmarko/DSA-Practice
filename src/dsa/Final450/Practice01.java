package dsa.Final450;

import java.util.Scanner;

/*
 * Array Reverse 
 * Input: arr[] = {1, 4, 3, 2, 6, 5}  
 * Output: {5, 6, 2, 3, 4, 1}
 * Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 *
 *
 * Input: arr[] = {4, 5, 1, 2} 
 * Output: {2, 1, 5, 4}
 * Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
 * 
 * 		Key Points:
 * Time Complexity: O(n), where n is the number of elements in the array. We go through each element once.
 * Space Complexity: O(1), since we are modifying the array in place and using only a small amount of extra 
 * space for the temporary variable temp. No extra arrays or lists are created.
 */
public class Practice01 {
//	static void reverseArray(int[] arr) {
//		int n = arr.length;
//		int[] temp = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			temp[i] = arr[n - i - 1];
//		}
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = temp[i];
//		}
//	}

	static void reverseArray(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of Array element you want to enter ! ");
		int size = sn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sn.nextInt();
		}

		reverseArray(arr);
//		for(int i=0; i<size; i++) {
//			System.out.println(arr[i]);
//		}
		printArray(arr);
		sn.close();
	}
}
